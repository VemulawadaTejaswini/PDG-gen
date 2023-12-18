import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int m = n;
        while (true) {
            int a = m % 10;
            sum += a;
            m = m / 10;
            if (m == 0) {
                break;
            }
        }
        System.out.println(n % sum == 0 ? "Yes" : "No");
    }
}