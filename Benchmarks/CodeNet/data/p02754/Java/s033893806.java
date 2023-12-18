import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = n % (a + b), t = n / (a + b), sum = 0;
        sum += a * t;
        sum += (s > a)? a:s;
        System.out.println(sum);
    }
}
