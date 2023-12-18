import java.util.*;

public class Main {
    
    public static class User {
        public boolean doLeftShakeHand;
        public boolean doRightShakeHand;
        public int score;
        public User( int score ){
            doLeftShakeHand = false;
            doRightShakeHand = false;
            this.score = score;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] params = in.nextLine().split(" " );
        int n = Integer.parseInt( params[0] );
        long m = Long.parseLong( params[1] );
        params = in.nextLine().split(" " );

        List<Integer> as = new ArrayList<>();
        for( int i = 0 ; i < n ; i++ ){
            as.add( Integer.parseInt( params[i] ) );
        }

        as.sort( Comparator.reverseOrder() );

        long ans = 0;

        if( m == 1 ){
            System.out.println( as.get(0) * 2 );
        }
        else if( m % 2 == 0 ){
            for( int i = 0 ; i <= m / 2 ; i++ ){
                ans += as.get(i) * 4;
            }
        }
        else {
            int i = 0;
            for( i = 0 ; i < m / 2 ; i++ ){
                ans += as.get(i) * 4;
            }
            ans += as.get(i) * 2;
        }

        System.out.println( ans );

    }

}
