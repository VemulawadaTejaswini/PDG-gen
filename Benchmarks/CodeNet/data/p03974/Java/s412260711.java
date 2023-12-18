import java.io.PrintWriter;
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
    static char S[][] ; // Σ|S| < 400000文字
    static char P[][] ;
    static int node[][] ;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new char[N][] ;
        for (int i=0 ; i<N ;i++) {
            S[i] =sc.next().toCharArray() ;
        }
        Q = sc.nextInt();
        K = new int[Q] ;
        P = new char[Q][] ;
        for (int i=0 ; i<Q; i++) {
            K[i] = sc.nextInt() -1 ;
            P[i] = sc.next().toCharArray() ;
        }
        ///
        int size= 0 ;
        for (int i=0 ; i<N ; i++) {
            size = size + S[i].length +1;
        }
        //size = 100 ;
        node = new int[size][64]; //max 400000 ;
        for (int i=0 ; i<size ; i++) {
            node[i][number] = i;
        }
        make_tree() ;
        /** /
        tree_dump() ;
        System.out.println() ;
        /**/
        
        ////// 出力 ////////////////
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            out.println(Solve(K[i], P[i]));
        }
        out.flush();
        ////////////////////////////
    }
        /**/
    /////////// tree dump /////////////

    static void tree_dump() {
        int cn;
        for (int i = 0; i < node_p; i++) {
            cn = node[i][number];
           // while (true) {
                System.out.printf("\n Node=%d, index=%d leaf=%d",
                        node[cn][number], node[cn][index], node[cn][leaf]);
                for (int j = 0; j < 26; j++) {
                    if ((node[cn][index] & power_2[j]) != 0) {
                        System.out.printf("\n    : char=%c, cnt=%d next_node=%d : ", 'a' + j, node[cn][sib_cnt], node[cn][next_node]);
                    }
                }
          //  }
        }
    }
        ////////////////////////////////
        /**/
    
    //////////////////////////////////////
    static int number = 0 ; // Node番号 [デバッグ用]
    static int index  = 1 ; // このレベルのノードの下に該当する文字があるかのIndex
    static int leaf   = 2 ; // このレベルの文字がleafを兼ねる場合のbit
    static int sib_cnt = 3 ;   // 今のレベルの各文字へのリンク数
    static int next_node = 32 ;// 次のレベルへのリンク
    
    static int node_p  = 0 ; // 次の空ノードへのポインタ

    //////////////////////////////////////
    static int power_2[] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,1<<13, 1<<14, 1<<15, 1<<16, 1<<17, 
                     1<<18, 1<<19, 1<<20, 1<<21, 1<<22, 1<<23, 1<<24, 1<<25}; 
    
    static void make_tree() {
        int[] node0 = node[0] ; // depth=0
        node_p ++ ;
        for (int i=0 ; i<N; i++) {
            make_tree2(node0, S[i]) ;
        }
    }
    static void make_tree2(int[] current_node, char s[]) {
        
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            int[] next;
            
            // 今のNodeに1文字の追加
            //current_node.add(c) ; 
            current_node[index] = current_node[index] | power_2[c-'a'] ;
            current_node[sib_cnt+(c-'a')] ++ ;
            // 最終文字
            if (i == s.length-1) { 
                current_node[leaf] = current_node[leaf] | power_2[c-'a'] ; // leafをセット
                break ;
            }
            // 次のレベルの準備 
            if (current_node[next_node+(c-'a')] > 0) {
                next = node[current_node[next_node+(c-'a')]];
            } else {
                // Add Node
                current_node[next_node+(c-'a')] = node_p;
                node_p++ ;
                next = node[current_node[next_node+(c-'a')]];
            }
            current_node = next ;
        }
    }


    static int Solve(int k, char pattern[]) {
        int cnt = 0 ;
        int[] current_node = node[0] ;
        OUTER:
        for (int i = 0; i < S[k].length; i++) {
            for (int j = 0; j < 26; j++) {
                char c = pattern[j] ;
                if ((current_node[index] & power_2[c-'a'])!=0) { //　こちらを優先にする(2016.10.23)
                    if (c != S[k][i]) {
                        cnt = cnt + current_node[sib_cnt+(c-'a')];
                    } else {
                        if ((current_node[leaf] & power_2[c-'a'])!=0) cnt ++ ; // 途中のleafをカウントする
                        // 2016.10.23追加  (不要なマッチングをカット。効果大だが、若干遅くなるケースもある)
                        if ((current_node[sib_cnt+(c-'a')] == 1) && (current_node[next_node+(c-'a')] > 0)) {
                            cnt++;
                            break OUTER;
                        }
                        //
                        current_node = node[current_node[next_node+(c - 'a')]];
                        break;
                    }
                }
            }
        }
        return cnt;
    }
}
