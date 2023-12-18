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
    static Node node_pool[] ;
    static Link link_pool[] ;
    
    public static void main(String[] args) {
        Main t = new Main() ;
        t.doit() ;
    }
    void doit() {
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
            size = size + S[i].length ;
        }
        size = size ;
        node_pool = new Node[size]; //max 400000 ;
        link_pool = new Link[size] ;
        for (int i=0 ; i<size ; i++) {
            node_pool[i] = new Node() ;
            node_pool[i].number = i;
            link_pool[i] = new Link() ;
        }
        make_tree() ;
        
        ////// 出力 ////////////////
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            out.println(Solve(K[i], P[i]));
        }
        out.flush();
        ////////////////////////////
    }
    
    //////////////////////////////////////
    class Node {
        //char c ;
        int number ;
        int  index ; // ノードの下のLinkに該当する文字があるかのIndex
        int link_cnt ;
        Link link_head ;
        int leaf ;
        
        boolean containsKey(char c) {
            if ((power_2[c-'a'] & index)!=0) return true; else return false ;
        }
        
        Link get(char cc) {
            if ((power_2[cc-'a'] & index)==0) return null ;
            Link ll = link_head ;
            while(ll != null) {
                if (ll.c_next == cc) return ll ;
                else ll = ll.siblings ;
            }
            return null ; // ここには来ない
        }
        Link add(char cc) {
            if ((power_2[cc-'a'] & index)!=0) return null ;
            index = index | power_2[cc-'a'] ;
            if (link_head == null) {
                link_head = link_pool[link_p] ;
                link_p++ ;
            }
            Link ll = link_head ;
            while(ll != null) {
                if (ll.c_next != 0) {
                    if (ll.siblings == null) {
                        ll.siblings = link_pool[link_p] ;
                        link_p++ ;
                    }
                    ll = ll.siblings ;
                }
                else {
                    ll.c_next = cc ;
                    return ll ;
                }
            }
            System.out.printf("ERROR in add.\n") ;
            return null ; // ここには来ない
        }
    }
    int node_p  = 0 ; // 次の空ノードへのポインタ
    //////////////////////////////////////
    class Link {
        char c_next ;
        Node next_node ;
        Link siblings ;
    }
    int link_p = 0 ;
    //////////////////////////////////////
    int power_2[] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,1<<13, 1<<14, 1<<15, 1<<16, 1<<17, 
                     1<<18, 1<<19, 1<<20, 1<<21, 1<<22, 1<<23, 1<<24, 1<<25}; 
    
    void make_tree() {
        Node node0 = node_pool[0] ; // depth=0
        node_p ++ ;
        for (int i=0 ; i<N; i++) {
            make_tree2(node0, S[i]) ;
        }
    }
    void make_tree2(Node current_node, char s[]) {
        
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            Node next;
            Link current_link;
            // 今のレベルで、Linkに1文字の追加
            if (current_node.containsKey(c)) {
                current_link = current_node.get(c);
                current_node.link_cnt ++ ;
            } else {
                current_link = current_node.add(c) ;
                current_node.link_cnt ++; 
            }
            if (i == s.length-1) { // 最終文字
                current_node.leaf = 1 ;
                break ;
            }
            // 次のレベルの準備 
            if (current_link.next_node != null) {
                next = current_link.next_node;
            } else {
                // Add Node
                current_link.next_node = node_pool[node_p];
                node_p++ ;
                next = current_link.next_node;
            }
            current_node = next ;
        }
    }


    int Solve(int k, char pattern[]) {
        int cnt = 0 ;
        Node current_node = node_pool[0] ;
        for (int i=0 ; i<S[k].length; i++) {
            for (int j=0 ; j<26; j++) {
                if (pattern[j]!=S[k][i]) {
                    //cnt = cnt + current_node.link_cnt  ;
                    Link ll ;
                    ll = current_node.get(pattern[j]) ;
                    if (ll != null) cnt = cnt + ll.next_node.link_cnt  ;
                } else {
                    cnt = cnt + current_node.leaf;
                    current_node = current_node.get(pattern[j]).next_node ;
                    break ;
                }
            }
        }
        return cnt ;
    }
}
