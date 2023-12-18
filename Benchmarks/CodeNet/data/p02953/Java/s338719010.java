import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] params = in.nextLine().split(" ");
        int[] hs = new int[n];
        for( int i = 0 ; i < n ; i++ ){
            hs[i] = Integer.parseInt( params[i]);
        }

        boolean flag = true;
        for( int i = 0 ; i < n - 1 ; i++ ){
            int prev = i == 0 ? 0 : hs[i-1];
            if( prev < hs[i]){
                hs[i] -= 1;
            }
            if( hs[i] > hs[i + 1 ]){
                flag = false;
                break;
            }
        }

        System.out.println( flag ? "Yes" : "No" );

    }

}
