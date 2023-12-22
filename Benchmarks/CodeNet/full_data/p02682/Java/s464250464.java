import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();

        int d = a + b;

        if (a >= k) {
            System.out.println(String.valueOf(k));
            return;
        }


            if (d >= k) {
                System.out.println(String.valueOf(a));
            } else {
                int e = k - d;
                System.out.println(String.valueOf(a - e));
            }
        }
    

}