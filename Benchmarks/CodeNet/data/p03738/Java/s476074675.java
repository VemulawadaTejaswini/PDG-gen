import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        int ret = A.compareTo(B);
        if (ret == 0) {
            System.out.println("EQUAL");
        } else if (ret > 0) {
            System.out.println("GREATER");
        } else {
            System.out.println("LESS");
        }

        return;
    }

}