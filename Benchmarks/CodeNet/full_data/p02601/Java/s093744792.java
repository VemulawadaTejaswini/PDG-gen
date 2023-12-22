// "static void main" must be defined in a public class.
import java.util.* ;
public class Main {
    static boolean helper( int a , int b , int c ) {
        return a<b && b<c ;
    }
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in ) ;
        Main obj = new Main() ;
        int A = S.nextInt() ;
        int B = S.nextInt() ;
        int C = S.nextInt() ;
        int k = S.nextInt() ;
        
        if( helper( A , B , C ) ) {
            System.out.println( "Yes" ) ;
            return ;
        }
        while( k-->0 && !helper( A , B , C ) ) {
            if( helper( A , B , C ) ) {
                System.out.println( "Yes" ) ;
                return ;
            }
            if( A>=B ) B *= 2 ;
            else if( B>=C ) C *= 2 ;
        }
        if(! helper( A , B , C ) )
        System.out.println( "No" ) ;
        else System.out.println( "Yes" ) ;
    }
    
}
