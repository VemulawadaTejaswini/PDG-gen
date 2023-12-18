import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void swap( int[] as , int i , int j ){
        int temp = as[i];
        as[i] = as[j];
        as[j] = temp;
    }

    private static boolean allCheck( int[] as , int n){
        for (int i = 0; i < n; i++) {
            if( as[i] == ((i == 0 ? as[n - 1] : as[i - 1]) ^ (i == n - 1 ? as[0] : as[i + 1])) ){
                return true;
            }
        }
        return false;
    }

    private static void debug( int[] as ){
        for( int i = 0 ; i < as.length ; i++ ){
            System.out.print(as[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        String[] params = in.nextLine().split(" ");
        int[] as = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
        }
        Arrays.sort(as);

        if( allCheck( as , n ) ){
            System.out.println("Yes");
            return;
        }
        for (int i = 0; i <= n - 1 / 2; i++) {
            for (int j = n - 1; j > i; j--) {
                if (as[j - 1] < as[j]) {
                    swap( as , j - 1 , j );
                    debug(as);
                    if( allCheck( as , n ) ){
                        System.out.println("Yes");
                        return;
                    }
                }
            }
        }

        System.out.println("No");

    }

}