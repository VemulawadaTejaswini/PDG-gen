import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String values = in.nextLine();

        BigInteger sum = new BigInteger("1");
        for (String val : values.split(" ")) {
            sum = sum.multiply(new BigInteger(val));
        }

        if (sum.subtract(new BigInteger("1000000000000000000")).signum() > 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum.toString());
        }
    }
}