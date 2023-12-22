// "static void main" must be defined in a public class.
import java.util.* ;
public class Main {
    
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        Main obj = new Main() ;
        int n = S.nextInt() ;
        long[] arr = new long[n] ;
        int terms = S.nextInt() ;
        for( int i=0;i<n;i++ ) arr[i] = S.nextLong() ;
        
        long pre = 1 ;
        boolean flag = true ;
        for( int i=0;i<terms;i++ ) {
            pre *= arr[i] ;
        }
        for( int i=0;i<arr.length-terms;i++ ) {
            long sum = 1 ;
            sum = pre/arr[i] ;
            sum = sum * arr[i+terms] ;
            
                if( pre<sum ) 
                    System.out.println( "Yes" ) ;
                else 
                    System.out.println( "No" ) ;
            
            pre = sum ;
        }
    
     }
    
}




