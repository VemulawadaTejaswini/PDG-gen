import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        double m=a/3.0;
        double q=m*m*m;
        System.out.println(q);

    }
}