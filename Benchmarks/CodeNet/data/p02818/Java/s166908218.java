import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        long tmp = k - a;
        a -= k;
        if (a < 0) {
            a = 0;
        }
        b -= tmp;
        System.out.println(String.format("%s %s", a, b));
        sc.close();
    }
}
