import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        double B = sc.nextDouble();

        int B_100 = (int) (B*100);

        long tmp = A*B_100/100;

        long result = (long) Math.floor(tmp);

        System.out.println(result);
    }
}