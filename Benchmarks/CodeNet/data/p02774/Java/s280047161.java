import java.util.*;

public class Main {

    private static int max = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" ");
        int n = Integer.parseInt( params[0] );
        int k = Integer.parseInt( params[1] );
        params = sc.nextLine().split(" ");
        long[] as = new long[n];
        List<Long> multiResults = new ArrayList<>();
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Long.parseLong( params[i] );
            for( int j = 0 ; j < i ; j++ ){
                multiResults.add( as[j] * as[i] );
            }
        }

        multiResults.sort((o1, o2) -> {
            if( o1 < o2 ){
                return -1;
            }
            if(o1.equals(o2)){
                return 0;
            }
            return 1;
        });

        System.out.println( multiResults.get( k - 1 ) );

    }

}
