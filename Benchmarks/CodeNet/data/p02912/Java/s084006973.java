import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);

        params = in.nextLine().split(" ");
        Long[] as = new Long[n];
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Long.parseLong( params[i] );
        }

        Arrays.sort( as , Comparator.reverseOrder());

        while( 0 < m ){
            if( n == 1 ){
                as[0] /= 2;
                m--;
            }
            else {
                while( 0 < m && as[0] >= as[1] ){
                    as[0] /= 2;
                    m--;
                }
                    Arrays.sort( as , Comparator.reverseOrder());
            }
        }

        long ans = 0;
        for( int i = 0 ; i < n ; i++ ){
            ans += as[i];
        }

        System.out.println( ans );

    }

}
