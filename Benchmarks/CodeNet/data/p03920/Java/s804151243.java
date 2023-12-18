import java.util.*;

/**
 * B - Exactly N points.
 */
public class Main {

    private static Map<Integer, List<Integer>> rtn = new HashMap<Integer, List<Integer>>();
    private static int min = -1;

    public static void main( String[] args ) {

        Scanner scn = new Scanner( System.in );
        int n = scn.nextInt();

        if ( n <= 0 ) {
            System.out.print( "Input is invalid!" );
        }

        for ( int i = 1; i <= n; i++ ) {
            List<Integer> list = new ArrayList<Integer>();
            test( i, list, n );
        }

        List<Integer> rtnList = rtn.get( min );

        for ( Integer num : rtnList ) {
            System.out.println( num );
        }
    }

    private static List<Integer> test( int i, List<Integer> list, int n ) {

        int temp = n - i;

        if ( temp == 0 ) {
            list.add( i );
            if ( min < 0 || min > i ) {
                min = i;
            }
            rtn.put( i, list );
        } else if ( temp < 0 ) {
            test( i, list, (n + (i - 1)) );
        } else if ( temp >= i + 1 ) {
            list.add( i );
            test( i + 1, list, temp );
        } else {
            test( i + 1, list, temp );
        }

        return list;

    }

}