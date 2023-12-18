import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        for ( int i = 0; i < S.length(); i++ ) {
            S = S.substring( S.length() - 1 ) + S.substring( 0, S.length() - 1 );
            //System.out.println( S );
            if( S.equals( T ) )
            {
                System.out.print( "Yes" );
                return;
            }
        }
        System.out.print( "No" );

        sc.close();
    }
}