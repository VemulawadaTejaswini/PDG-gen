import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String[] params = in.nextLine().split(" ");
        int[] ws = new int[n];
        for( int i = 0 ; i < params.length ; i++ ){
            ws[i] = Integer.parseInt(params[i]);
        }

        int ans = -1;
        for( int t = 1 ; t < n ; t++ ){

            int min = 0;
            int max = 0;

            for( int i = 0 ; i <= t ; i++ ){
                min += ws[i];
            }
            for( int i = t + 1 ; i < n ; i++ ){
                max += ws[i];
            }

            max -= min;
            if( max < -1 ) max *= -1;

            if( ans == -1 )ans = max;
            else if( max < ans ){
                ans = max;
            }

        }

        System.out.println( ans );

    }
}