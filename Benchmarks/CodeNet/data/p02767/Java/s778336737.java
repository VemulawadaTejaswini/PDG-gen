import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt( sc.nextLine() );
        String[] params = sc.nextLine().split(" " );
        int[] xs = new int[n];
        int minPos = 100;
        int maxPos = 0;
        for( int i = 0 ; i < n ; i++ ){
            xs[i] = Integer.parseInt( params[i] );
            if( xs[i] < minPos ){
                minPos = xs[i];
            }
            if( maxPos < xs[i] ){
                maxPos = xs[i];
            }
        }

        int minHp = 10000000;
        for( int i = minPos ; i < maxPos ; i++ ){
            int hpTotal = 0;
            for( int j = 0 ; j < n ; j++ ){
                hpTotal += ( xs[j] - i ) * ( xs[j] - i );
            }
            if( hpTotal < minHp ){
                minHp = hpTotal;
            }
        }

        System.out.println( minHp );

    }


}
