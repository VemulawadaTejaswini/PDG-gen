import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );

        if( n < 10 ){
            System.out.println( n );
            return;
        }
        if( n < 100 ){
            int ans = 9;
            for( int i = 10 ; i <= n ; i++ ){
                if( i/10 == i%10 ){
                    ans+=3;
                    continue;
                }
                if( i % 10 == 0 ){
                    continue;
                }
                int rev = ( i % 10 ) * 10 + ( i / 10 );
                if( n < rev ){
                    continue;
                }
                ans++;
            }
            System.out.println( ans );
            return;
        }
        
        System.out.println( 0 );
        return;

    }

}
