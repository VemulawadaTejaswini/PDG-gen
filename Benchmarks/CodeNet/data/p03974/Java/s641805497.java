import java.io.PrintWriter;
import java.util.HashMap;
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
    static HashMap <Character, Node> map0 ;
    
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
        make_tree() ;
        
       /* 
        for (int i=0 ; i<Q ; i++) {
            System.out.println(Solve(K[i], P[i])) ;
        }
        */
        ////// 出力を高速に ////////////////
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            out.println(Solve(K[i], P[i]));
        }
        out.flush();
        //////////////////////////////
 

    }
    class Node {
        int link_cnt ;
        HashMap link ;
        int leaf ;
    }
    void make_tree() {
        map0 = new HashMap<>() ; // depth=0
        for (int i=0 ; i<N; i++) {
            make_tree2(map0, S[i]) ;
            /*
            int total = 0 ;
            for (Object n : map0.values()) {
                total = total+((Node)n).link_cnt ;
            }
            System.out.printf("Total strings= %d\n", total) ;
            */
        }
    }
    void make_tree2(HashMap map, char s[]) {
        // 1文字の追加
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            Node b;
            HashMap next;
            if (map.containsKey(c)) {
                b = (Node) map.get(c);
                b.link_cnt ++ ;
            } else {
                b = new Node();
                b.link_cnt = 1; 
                map.put(c,b);
            }
            if (i < s.length -1) {
            // 次の一文字の追加へ 
                if (b.link != null) {
                    next = b.link;
                } else {
                    b.link=new HashMap();
                    next = b.link;
                }
                map = next ;
            } else { // 最終文字
                b.leaf = 1 ;
            }
        }
    }


    int Solve(int k, char pattern[]) {
        int cnt = 0 ;
        HashMap map = map0 ;
        for (int i=0 ; i<S[k].length; i++) {
            for (int j=0 ; j<26; j++) {
                if (pattern[j]!=S[k][i]) {
                    if (map.containsKey(pattern[j])) cnt = cnt + ((Node)map.get(pattern[j])).link_cnt ;
                } else {
                    cnt = cnt + ((Node)map.get(pattern[j])).leaf;
                    map = ((Node)map.get(pattern[j])).link ;
                    break ;
                }
            }
        }
        return cnt ;
    }
}
