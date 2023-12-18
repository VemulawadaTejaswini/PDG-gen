import java.util.Scanner;

public class Main {

    public static int xor(int a , int b ){

        int temp = a ^ b;
        return temp;
    }

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        int[] as = new int[n];
        String[] params = in.nextLine().split(" ");

        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
        }

        for( int i = 0 ; i < n ; i++ ){
            int left = i == 0 ? as[n-1] : as[i-1];
            int me = as[i];
            int right = i == n - 1 ? as[0] : as[i+1];
            if( me != xor( left , right ) ){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}