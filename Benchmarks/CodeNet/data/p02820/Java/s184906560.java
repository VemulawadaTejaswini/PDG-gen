import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" " );
        int n = Integer.parseInt( params[0] );
        int k = Integer.parseInt( params[1] );
        params = in.nextLine().split(" " );
        int r = Integer.parseInt( params[0] );
        int s = Integer.parseInt( params[1] );
        int p = Integer.parseInt( params[2] );
        String t = in.nextLine();

        long ans = 0;
        char[] tChars = t.toCharArray();
        for( int i = 0 ; i < n ; i++ ){
            char housing = tChars[i];
            if( k <= i ){
                char beforeHousing = tChars[ i - k ];
                if( beforeHousing == housing ){
                    tChars[ i ] = 'a';
                    continue;
                }
            }

            if( housing == 'r' ){
                ans += p;
            }
            else if( housing == 's' ){
                ans += r;
            }
            else {
                ans += s;
            }
        }

        System.out.println( ans );

    }

}
