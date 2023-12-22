// "static void main" must be defined in a public class.
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        Main obj = new Main() ;
        int t = S.nextInt() ;
        int change = t%1000 ;
        if( change==0 ) System.out.println( "0" ) ;
        else{
            while( change>=1000 ) {
                change /= 1000 ;
            }
            System.out.println( (change) ) ;
            
        }
    }
}