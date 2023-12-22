import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int s = a / b;
        int r = a % b;
        double d = 1.0 * a / b;

        System.out.println( s + " " + r + " " + d );
    }
}