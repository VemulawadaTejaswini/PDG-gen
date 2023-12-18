import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt( sc.nextLine() );
        String[] params = sc.nextLine().split(" ");
        for( int i = 0 ; i < n ; i++ ){
            int a = Integer.parseInt( params[i] );
            if( a % 2 == 0 ){
                if( a % 3 != 0 && a % 5 != 0 ){
                    System.out.println( "DENIED" );
                    return;
                }
            }
        }

        System.out.println( "APPROVED" );

    }

}
