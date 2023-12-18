import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * http://code-festival-2016-qualb.contest.atcoder.jp/tasks/codefestival_2016_qualB_e
 * 
 * @author Cummin
 */
public class Main {

    static int N ; //  1<= N <= 100000
    static int Q ; //  1<= Q <= 100000
    static int K[] ;
    static String S[] ; // Σ|S| < 400000文字
    static String P[];
    static PTNode root ;
    static int node_no = 0 ;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new String[N];
        for (int i=0 ; i<N ;i++) {
            S[i] =sc.next() ;
        }
        Q = sc.nextInt();
        K = new int[Q] ;
        P = new String[Q];
        for (int i=0 ; i<Q; i++) {
            K[i] = sc.nextInt() -1 ;
            P[i] = sc.next() ;
        }
        ///
        int size= 0 ;
        for (int i=0 ; i<N ; i++) {
            size = size + S[i].length() +1;
        }
        make_tree() ;
        /** /
        tree_dump(root) ;
        System.out.println() ;
        /**/
        
        ////// 出力 ////////////////
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            out.println(Solve(root, K[i], P[i]));
        }
        out.flush();
        ////////////////////////////
    }
        /**/
    /////////// tree dump /////////////

    static void tree_dump(PTNode cn) {
            System.out.printf("\n Node=%d, index=%d, char=%s, link_cnt=%d, leaf=%d ",
                    cn.number, cn.index, cn.s, cn.link_cnt, cn.leaf);
            for (PTNode p: cn.next_node) {
                System.out.printf("child=%d,", p.number) ;
            }      
            for (PTNode p: cn.next_node) {
                tree_dump(p) ;
            }
    }
        ////////////////////////////////
        /**/
    
    //////////////////////////////////////
    static class PTNode {   // Patricia Trie  // 親がindexを持つ。親のnodeからchild_nodeを操作する
        String s ;
        int number ;
        int index ; // ノードの下のNodeに該当する文字があるかのIndex
        int link_cnt ;
        ArrayList <PTNode> next_node; // 次のレベルへのリンク
        int leaf ;
        PTNode(String st) {
            this.number = node_no ;
            this.s = st ;
            node_no ++ ;
            next_node = new ArrayList <>() ;
//            System.out.printf("PTNode (New)= %d, string=\"%s\"\n",number, s) ;
        }
        void update_index(String s) {
            if (s.length()==0) return ;
            char c = s.charAt(0) ;
            index = index | power_2[c-'a'] ;
        }
        boolean child_hasKey(String s) {
            if (s.length()==0) return false ;
            char c = s.charAt(0) ;
            if ((index & power_2[c-'a'])==0) return false ;
            else return true ;
        }
    }
    static int compare(String a, String b) { // マッチしない位置を返す　// 全体がマッチすると、min(a.length, b.length)+1を返す
        int len = a.length() ;
        if (len==0) return 0 ;
        if (len>b.length()) len = b.length() ;
        for (int i=0 ; i<len ; i++){
            if (a.charAt(i)!=b.charAt(i)) return i+1 ;
        }
        return len +1 ;       
    }
    /*
    static int compare(String a, String b) { // マッチしない位置を返す　// 全体がマッチすると、min(a.length, b.length)+1を返す
        char aa[] = a.toCharArray() ;
        char bb[] = b.toCharArray() ;
        int len = aa.length ;
        if (len==0) return 0 ;
        if (len>bb.length) len = bb.length ;
        for (int i=0 ; i<len ; i++){
            if (aa[i]!=bb[i]) return i+1 ;
        }
        return len +1 ;       
    }
    */
    static PTNode insert(PTNode node, String in) {
        if ( ! node.child_hasKey(in) ) {
            // 子供のエントリーは一文字目から合わない->nodeの追加
            PTNode new_n = new PTNode(in) ;
            node.next_node.add(new_n) ;
            node.update_index(new_n.s) ;
            node.link_cnt ++ ;
            new_n.leaf = 1 ;
            return new_n ;
        }
        // inの1文字目から始まるエントリーが子供にある
        // // 子供のノードを特定する
        PTNode child_node = null;
        for (PTNode p: node.next_node) {
            if (p.s.charAt(0)==in.charAt(0)) {
                child_node = p ;
                break ;
            }
        }
        if (child_node==null)    System.out.printf("Child node match ERROR\n") ;
        int pos = compare(child_node.s, in) ; // 全体がマッチすると、length+1を返す
        if ((pos> child_node.s.length()) && (in.length() == child_node.s.length())) { 
            // 全体がマッチし、かつ、同じ長さ==>Nodeは追加せずにLeafだけ追加
            node.link_cnt ++ ;
            child_node.leaf = 1 ;
            return node ;
        }
        if ((pos > child_node.s.length())&&(in.length()>child_node.s.length())) {
           // 全体がマッチし、かつ、inが長い -> 長い部分を、子供として追加する
            in = in.substring(pos-1) ;
            insert(child_node, in) ;
            node.link_cnt++ ;
            return node ;
        }
        // 分割が必要な場合
        String head = child_node.s.substring(0, pos-1) ;
        String tail = child_node.s.substring(pos-1) ;
//         System.out.printf("pos=%d head=\"%s\", tail=\"%s\"\n", pos, head, tail) ;
        // マッチした長さがsより短い場合、元のノードを分割する
        PTNode temp = child_node ;
        node.next_node.remove(child_node) ;
        PTNode new_n = new PTNode(head) ; // これを前に挿入する
        node.next_node.add(new_n) ;
        new_n.link_cnt = temp.link_cnt + temp.leaf  ;        //
        temp.s = tail ;
        new_n.next_node.add(temp) ;
        new_n.update_index(tail);
         // inはsの部分文字列　-> 挿入したノードにLeafを追加
        if((pos-1)==in.length()) { 
            new_n.leaf = 1;
            node.link_cnt++; // 最後に親を更新する
        } else {
        //  相違する部分のノードを追加
        String tail2 = in.substring(pos-1);
            PTNode new_n2 = new PTNode(tail2);
            new_n.next_node.add(new_n2);
            new_n.update_index(tail2);
            new_n.link_cnt++ ;
            new_n2.leaf = 1;
            node.link_cnt++; // 最後に親を更新する
        }
        return new_n ;
    }    

    //////////////////////////////////////
    static int power_2[] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,1<<13, 1<<14, 1<<15, 1<<16, 1<<17, 
                     1<<18, 1<<19, 1<<20, 1<<21, 1<<22, 1<<23, 1<<24, 1<<25}; 
    
    static void make_tree() {
        root = new PTNode("") ;
        for (int i=0 ; i<N; i++) {
            insert(root, S[i]) ;
        }
    }

    static int Solve(PTNode current_node, int k, String pattern) {
        int cnt = 0 ;
        char ptn[] = pattern.toCharArray() ;
        for (int i=0 ; i<S[k].length(); ) {
            OUTER: 
            for (int j=0 ; j<26; j++) {
                if (! current_node.child_hasKey(pattern.substring(j,j+1))) continue ;
                for (PTNode child_node : current_node.next_node) {
                    if (!(child_node.s.charAt(0)==ptn[j])) continue ;
                    int pt = S[k].charAt(i)-ptn[j] ;
                    if (pt != 0) {
                        cnt = cnt + child_node.link_cnt + child_node.leaf;
                        continue;
                    }
                    if (pt == 0) {
                        cnt = cnt + child_node.leaf;
                            i = i + child_node.s.length() ;
                            current_node = child_node ;
                            break OUTER;
                    }
                }
            }
        }
        return cnt ;
    }
}
