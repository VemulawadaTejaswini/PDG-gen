import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        Main obj = new Main() ;
        int len = S.nextInt() ;
        long[] integers = new long[len] ;
        int L = S.nextInt() ;
        for( int i=0;i<len;i++ ) integers[i] = S.nextLong() ;
        long maxProduct = Long.MIN_VALUE;
        long start = 0;
        for (int i = 0; i + L < integers.length; i++) {
            long tmp = 1;
            for (int j = i; j < i + L; j++) tmp *= integers[j];
            if (tmp > maxProduct) {
                maxProduct = tmp;
                start = i;
            }
        }
        long result = maxProduct%1000000007;    
        System.out.println(result );
    }
}