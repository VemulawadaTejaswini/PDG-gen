import java.util.*;

public class Main {
    
    static long[] a;
    static long[] p;
    
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long X = sc.nextLong();
        
        a = new long[N+1];
        a[0] = 1L;
        p = new long[N+1];
        p[0] = 1L;
        
        for(int i = 1; i <= N; i++){
            a[i] = a[i-1] * 2 + 3;
            p[i] = p[i-1] * 2 + 1;
        }
        
        System.out.println( f(N, X) );
    }
    
    static long f(int N, long X){
        
        if( N == 0 ){
            return 1;
        }
        
        if( X == 1 ){
            return 0;
        }
        
        if( 1 < X && X <= a[N-1] + 1 ){
            return f(N-1, X-1);    
        }
        
        if( X == a[N-1] + 2 ){
            return p[N-1] + 1;
        }
        
        if( a[N-1] + 2 < X && X <= 2 * a[N-1] + 2 ){
            return p[N-1] + 1 + f(N-1, X-a[N-1]-2);
        }
        
        // X == a[N]
        return p[N];
    }
}
