import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int m = Integer.parseInt(n);
        int a = Character.getNumericValue(n.charAt(0));
        if (a * 111 >= m) {
            System.out.println(a * 111);
        } else {
            System.out.println((a + 1) * 111);
        }
    }
}
