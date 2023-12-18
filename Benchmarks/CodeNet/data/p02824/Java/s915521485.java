import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" " );
        int n = Integer.parseInt( params[0] );
        int m = Integer.parseInt( params[1] );
        int v = Integer.parseInt( params[2] );
        int p = Integer.parseInt( params[3] );

        params = in.nextLine().split(" " );

        int[] as = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt( params[i] );
        }

        Arrays.sort( as );

        int border = as[ n - 1 - p ];
        int ngCount = 0;
        for( int i = n - 1 - p ; 0 <= i ; i-- ){
            if( as[i] + m < border ){
                ngCount = i;
            }
        }
        System.out.println( n - 1 - ngCount );
        
    }

}

