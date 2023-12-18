import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap ;

/**
 * http://arc060.contest.atcoder.jp/tasks/arc060_c
 * 
 * @author Cummin
 */
public class ARC060_E {
        static int N ;  // 2 <= N <= 10^5
        static long L ; // 1 <= L <= 10^9
        static int Q ;  // 2 <= Q <= 10^5
        static int X[] ;// 1 <= X <= 10^9, X[0..N-1]
        
        // static int DP[][] ; // DP[from][to]の日数
        static HashMap <Integer, Integer> DP = new HashMap <>() ;
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

        //DP = new int[N][N] ;
/*
        for (int i = 0 ; i<Q ; i++) {
            System.out.println(Solve(Qs[i][0], Qs[i][1])) ;
//            System.out.println("-----") ;
        }
        */
        ////// 出力も高速に ////////////////
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            out.println(Solve2(Qs[i][0], Qs[i][1]));
        }
        out.flush();
    }
    static int Solve2(int from, int to) {
        int cnt = 1 ;
        int ptr = from+1 ;
        while (ptr<=to) {
            if ((X[ptr]-X[from])<=L) {
                ptr++ ;
            } else {
                from = ptr -1 ;
                cnt ++ ;
            }
        }
        return cnt ;
    }
    static int Solve(int from, int to) {
        if (DP.containsKey(from*100000+to)) return DP.get(from*100000+to) ;
        //if (DP[from][to] != 0) return DP[from][to] ;
        int max = from ;
        for (int i=from+1 ; i<=to; i++){
            if ((X[i]-X[from])<=L) {
                max = i ;
            } else break ;           
        }
        if (max == to) {
            //DP[from][to] = 1 ;
            DP.put(from*100000+to,1) ;
        } else {
            //DP[from][to] = Solve(max, to) +1 ;
            DP.put(from*100000+to, Solve(max, to)+1) ; 
        }
        // return DP[from][to] ;
        return DP.get(from*100000+to) ;
    }

    //////////////// 高速読み込み //////////////////////
    
    static int[] fast_read(int N) {
        int elements[] = new int[N];
        int e_cnt = 0;
        while (e_cnt < N) {
            char c;
            c = get_char();
            while ((c < '0') || ('9' < c)) { // Skip 非数値文字
                c=get_char() ;
            }
            elements[e_cnt] = 0;
            while (('0' <= c) && (c <= '9')) {  // 数値文字を変換する
                elements[e_cnt] = elements[e_cnt] * 10 + (int) c - '0';
                c = get_char();
            }
//            System.out.printf("\nelement[%d] = %d \n", e_cnt + 1, elements[e_cnt]);
            e_cnt++;
        }
        return elements;
    }
    
    ///////////////// get_char() /////////////////////////////////
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
               ex.printStackTrace();
               System.exit(-1); // 終了する
            }
            ptr = 0;
        }
        ret = c_buf[ptr];
        ptr++;
        return ret;
    }
}

