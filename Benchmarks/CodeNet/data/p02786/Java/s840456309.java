import java.util.Scanner;

public class Main {

    private static long tree( long ans , long h ){

        if( h == 1 ){
            return ++ans;
        }
        return 1 + tree( ans , h/2 ) + tree( ans , h/2 );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong( sc.nextLine() );

        if( h == 1 ){
            System.out.println( 1 );
            return;
        }

        long ans = 0;
        long depth = 0;
        long width = 1;
        while( h != 1 ){
            ans += width;
            h /= 2;
            depth++;
            width *= 2;
        }
        ans += width;
        System.out.println( ans );
    }

}
