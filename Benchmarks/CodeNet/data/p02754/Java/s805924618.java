import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long min_blue = a * (n / (a + b));
        if (n % (a + b) <= a) {
            System.out.println(min_blue + n % (a + b));
        } else {
            System.out.println(min_blue + a);
        }
        sc.close();
    }
}