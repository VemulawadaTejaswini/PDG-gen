import java.util.Scanner;

public class Main {

    public static  boolean check( int[] as , int n ){
        for( int i = 0 ; i < n ; i++ ){
            int left = i == 0 ? as[n-1] : as[i-1];
            int me = as[i];
            int right = i == n - 1 ? as[0] : as[i+1];
            if( me != (left ^ right) ){
                return false;
            }
        }
        return true;
    }

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] as = new int[n];
        String[] params = in.nextLine().split(" ");

        for( int i = 0 ; i < n ; i++ ){
            as[i] = Integer.parseInt(params[i]);
        }

        if( check( as , n ) ){
            System.out.println("Yes");
            return;
        }

        for( int i = 0 ; i < n - 1 ; i++ ){
            for( int j = i + 1 ; j < n ; j++ ){
                int temp = as[i];
                as[i] = as[j];
                as[j] = temp;
                if( check( as , n ) ){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}