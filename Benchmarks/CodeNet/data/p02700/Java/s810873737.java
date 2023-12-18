import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int d = cin.nextInt();
        System.out.println(Math.ceil(1.0*a/d)>=Math.ceil(1.0*c/b) ? "Yes" : "No");
    }
}
