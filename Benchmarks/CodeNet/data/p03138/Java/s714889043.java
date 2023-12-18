import java.util.*;
import java.math.*;
// not sure
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        long[] ary = new long[n];
        int MAX_BIT_COUNT = (new BigInteger(k+"")).bitLength();
        // System.out.println(MAX_BIT_COUNT);
        // number of 0s have to be greater
        int[] onesCt = new int[MAX_BIT_COUNT]; // bits from r to l
        for( int i = 0; i < n; i++ ) {
            ary[i] = in.nextLong();
            int ind = 0;
            for( int j = 1; j <= MAX_BIT_COUNT; j<<=1 ) {
                if((ary[i]&j) >= 1 ) onesCt[ind]++;
                ind++;
                // System.out.println(j);
            }
        }
        // System.out.println(Arrays.toString(onesCt));
        long xor = 0L;
        for( int i = 0; i < MAX_BIT_COUNT; i++ ) {
            if( onesCt[i] < n/2.0 ) xor += (1<<i);
        }
        long ans = 0L;
        for( long i : ary ) ans += i^xor;
        System.out.println(ans);
    }
}