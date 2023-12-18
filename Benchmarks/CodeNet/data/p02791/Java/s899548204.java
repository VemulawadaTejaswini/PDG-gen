import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        String[] params = in.nextLine().split(" ");
        int[] ps = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            ps[i] = Integer.parseInt( params[i] );
        }

        int ans = 0;
        boolean preOk = false;
        int pre = 0;
        for( int i = 0 ; i < n ; i++ ){
            if( preOk && ps[i] < ps[pre] ){
                ans++;
                pre = i;
                continue;
            }
            boolean isOk = true;
            for( int j = 0 ; j <= i ; j++ ){
                if( ps[j] < ps[i] ){
                    isOk = false;
                    break;
                }
            }
            preOk = isOk;
            pre = i;
            if( isOk ){
                ans++;
            }
        }

        System.out.println( ans );

    }

}
