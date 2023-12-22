import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        long tmpA = sc.nextLong();
        long tmpB = sc.nextLong();
        long tmpC = sc.nextLong();
        long tmpD = sc.nextLong();
        long a = Math.max(tmpA * tmpC, tmpA * tmpD);
        long b = Math.max(tmpB * tmpC, tmpB * tmpD);

        System.out.println(Math.max(a, b));

        sc.close();
    }
}