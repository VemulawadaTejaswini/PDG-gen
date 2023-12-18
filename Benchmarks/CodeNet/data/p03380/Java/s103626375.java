import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a[] = new int[N];
        int maxI = 0;
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            maxI = Math.max(maxI, a[i]);
        }
        
        int maxJ = 0;
        int maxJJ = 0;
        for(int i = 0; i < N; i++) {
            int r = maxI - a[i];
            int x = Math.min( a[i], r );
            if( maxJ < x ) {
                maxJJ = a[i];
            }
            maxJ = Math.max(maxJ, x);
        }
        System.out.println( maxI + " " + maxJJ );
        // System.out.println( comb( (long)maxI, (long)maxJJ ) );
    }
    
    public static long comb( long i , long j ) {
        long X = perm(i, j);
        long Y = 1;
        for(long x = j; 0 < x; x--) {
            Y *= x;
        }
        

        return X / Y;
    }
    
    public static long perm( long i , long j ) {
        long sum = 1;
        for(long x = 0; x < j; x++) {
            sum *= i;
            i--;
        }
        return sum;
    }
}
