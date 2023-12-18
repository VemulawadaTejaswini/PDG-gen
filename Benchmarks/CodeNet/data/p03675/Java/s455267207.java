import java.util.*;

public class Main{
    public static long mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){

        int N = sc.nextInt();

        int[] t = new int[N*2];
        int l = 0;
        int r = 1;
        int k = 1;
        int ii = 1;
        for( int i = 0; i < N; i++, k++ ){
            if( (k & 1) == 0 ){
                t[N+l] = sc.nextInt();
                l--;
            }else{
                t[N+r] = sc.nextInt();
                r++;
            }
            // if( ii++ == 3) { k++; ii=0; }
        }

        int ind = 1;
        if( k%2 == 1 ){
        	for( int i = N+l+1; i < N+r; i++ ) {
        		System.out.printf( "%d%c", t[i], ind == N ? '\n' : ' ' );
        	}
        }else{
        	for( int i = N+r-1; i > N+l; i-- ) {
        		System.out.printf( "%d%c", t[i], ind == N ? '\n' : ' ' );
        	}
        }


    }
}