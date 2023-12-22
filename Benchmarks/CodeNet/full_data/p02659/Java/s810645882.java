import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("input.txt"));

        long a = in.nextLong();


        BigDecimal b = new BigDecimal(String.valueOf(in.nextDouble()));
        b = b.multiply(new BigDecimal(String.valueOf(a)));

        String s = b.toString();
        System.out.println(s.substring(0, s.indexOf(".")));
    }
}
