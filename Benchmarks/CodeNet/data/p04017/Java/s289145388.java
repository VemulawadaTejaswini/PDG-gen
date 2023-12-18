import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * http://arc060.contest.atcoder.jp/tasks/arc060_c
 * 
 * @author Cummin
 */
public class Main {
        static int N ;  // 2 <= N <= 10^5
        static long L ; // 1 <= L <= 10^9
        static int Q ;  // 2 <= Q <= 10^5
        static int X[] ;// 1 <= X <= 10^9, X[0..N-1]
        
        static int DP[][] ; // DP[from][to]の日数

        public static void main(String[] args) {
//        System.out.printf("At Coder ARC060 問題E \n") ;
long start = System.currentTimeMillis();         
        /** /    
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt() ;
        for (int i=0 ; i<N; i++) {
            // X[i]= sc.nextInt() ;
            X[i]  = Integer.parseInt(sc.next()); // この一行(10^5要素)で、113秒
        }
        */
        X = fast_read(1) ;
        N = X[0] ;
        X = fast_read(N) ;
//System.out.printf("N=%d\n", N) ;
long end = System.currentTimeMillis();
//System.out.println((end - start)  + "ms");
start = System.currentTimeMillis();          
        int Y[] ;
        Y = fast_read(2) ;
        L = Y[0] ;
        Q = Y[1] ;
//        L = sc.nextLong() ;
//        Q = sc.nextInt() ;
//System.out.printf("L=%d, Q=%d\n", L, Q) ;
        int Qs[][] = new int[Q][2] ; // Qs[][from] < Qs[][to]
        for (int i=0 ; i<Q ; i++) {
            int from, to ;
            /*   読み込みが遅いので変更 (これで、10^5*3個が213秒)
            from = sc.nextInt() ;
            to   = sc.nextInt() ;
            */
//            from = Integer.parseInt(sc.next()); //  (これで、10^5*3個が201秒)
//            to   = Integer.parseInt(sc.next()); //  この二行(10^5行 2数値)で、92.5秒
            Y = fast_read(2) ;
            from = Y[0] ;
            to   = Y[1] ;
            if (from>to) {
                int t ;
                t = from; from = to ; to = t ;
            }
            Qs[i][0] = from - 1 ;
            Qs[i][1] = to - 1 ;
        }
end = System.currentTimeMillis();
//System.out.println((end - start)  + "ms");

        DP = new int[N][N] ;
        for (int i = 0 ; i<Q ; i++) {
            System.out.println(Solve(Qs[i][0], Qs[i][1])) ;
//            System.out.println("-----") ;
        }
    }
    
    static int Solve(int from, int to) {
        if (DP[from][to] != 0) return DP[from][to] ;
        int max = from ;
        for (int i=from+1 ; i<=to; i++){
            if ((X[i]-X[from])<=L) {
                max = i ;
            } else break ;           
        }
//        System.out.printf("from =%d, to=%d len=%d \n", from+1, max+1,X[max]-X[from]) ;
        if (max == to) {
            DP[from][to] = 1 ;
        } else {
            DP[from][to] = Solve(max, to) +1 ;
        }
        return DP[from][to] ;
    }

    //////////////// 高速読み込み //////////////////////
    
    static int[] fast_read(int N) {

//        System.out.printf("fast_read(%d) \n", N);
        int elements[] = new int[N];
        int e_cnt = 0;
        while (e_cnt < N) {
            char c;
            c = get_char();
            while ((c < '0') || ('9' < c)) { // Skip 非数値文字
//                    System.out.printf("%c", c) ;
                c=get_char() ;
            }
            elements[e_cnt] = 0;
            while (('0' <= c) && (c <= '9')) {  // 数値文字を変換する
//                    System.out.printf("%c", c[ptr]) ;
                elements[e_cnt] = elements[e_cnt] * 10 + (int) c - '0';
                c = get_char();
            }
//            System.out.printf("\nelement[%d] = %d \n", e_cnt + 1, elements[e_cnt]);
            e_cnt++;
        } // continue for
        return elements;
    }
    
    static char c_buf[] = new char[1024*1024];
    static int ptr = 0 ;
    static int c_len = 0 ;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static char get_char() {
        char ret;

        if (ptr >= c_len) {
            try {
                c_len = br.read(c_buf);
            } catch (IOException ex) {
                Logger.getLogger(ARC060_E.class.getName()).log(Level.SEVERE, null, ex);
            }
            ptr = 0;
        }
        ret = c_buf[ptr];
        ptr++;
        return ret;
    }
}

