import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void swap( int[] as , int i , int j ){
        int temp = as[i];
        as[i] = as[j];
        as[j] = as[i];
    }

    private static boolean check( int left , int center , int right ){
        return ( center == (left ^ right) );
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

        for (int i = 0; i < as.length - 1; i++) {
            for (int j = as.length - 1; j > i; j--) {
                if (as[j - 1] > as[j]) {
                    swap( as , j - 1 , j );
                    for (int k = 0; k < n; k++) {
                        if(
                            check(
                                k == 0 ? as[n - 1] : as[k-1] ,
                                as[k],
                                k == n- 1 ? as[0]:as[k+1]
                            )
                        ){
                            System.out.println( "Yes");
                        }
                    }
                }
            }
        }

        System.out.println("No");

    }

}