
import java.util.*;
public class AtCoderABC142A {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            System.out.println("1.0000000000");
        } else if (n % 2 == 0) {
            System.out.println("0.5000000000");
        } else {
            System.out.println("0.6000000000");
        }

    }

}
