import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print( a / b );
        System.out.print(" ");
        System.out.print( a % b );
        System.out.print(" ");
        System.out.printf( "%.5f\n", (double)a / b );
    }
}