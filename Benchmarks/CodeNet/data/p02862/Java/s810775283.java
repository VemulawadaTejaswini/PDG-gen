import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int x = Integer.parseInt( params[0] );
        int y = Integer.parseInt( params[1] );

        if( y > 2 * x ){
            System.out.println( 0 );
            return;
        }
        if( y == 2 * x ){
            System.out.println( 1 );
            return;
        }
        if( (float)y < (float)x / 2 ){
            System.out.println( 0 );
            return;
        }
        if( (float)y == (float)x / 2 ){
            System.out.println( 1 );
            return;
        }

        int b = y + x;
        if( b % 3 != 0 ){
            System.out.println( 0 );
            return;
        }







        System.out.println( 0 );
        return;

    }

}