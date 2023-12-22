import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int t = scan.nextInt();

        int a = n / x;

        int b = n % x;
        if (b != 0) {
            System.out.println(t * (a + 1));
            
        } else {

            System.out.println(t * a);
            
        }
        
    }
}