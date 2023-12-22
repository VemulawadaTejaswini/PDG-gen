// "static void main" must be defined in a public class.
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        String s = S.nextLine() ;
        int result = 0 ; int count = 0 ;
        for( char ch : s.toCharArray() ) {
            if( ch=='R' ) {
                count++ ;
            }else count = 0 ;
            result = Math.max( result , count ) ;
        }
        System.out.println(result) ;
    }
}