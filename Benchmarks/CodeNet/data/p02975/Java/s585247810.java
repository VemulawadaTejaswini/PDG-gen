import java.util.Scanner;

public class Main {

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] as = new int[n];
        String[] params = in.nextLine().split(" ");

        int oddCount = 0;
        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
            if( as[i] % 2 != 0){
                oddCount++;
            }
        }

        if( n % 2 != 0 && 0 < oddCount ){
            System.out.println("No");
            return;
        }

        for( int i = 0 ; i < n ; i++ ){
            int left = i == 0 ? as[n-1] : as[i-1];
            int me = as[i];
            int right = i == n - 1 ? as[0] : as[i+1];
            if( me != (left ^ right) ){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}