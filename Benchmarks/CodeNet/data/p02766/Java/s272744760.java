import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] params = sc.nextLine().split(" " );
        long n = Long.parseLong( params[0] );
        int k = Integer.parseInt( params[1] );
        int count = 0;
        int k2 = 1;
        while( true ){
            k2 *= k;
            count++;
            if( n <= k2 ){
                break;
            }
        }

        System.out.println( count );

    }


}
