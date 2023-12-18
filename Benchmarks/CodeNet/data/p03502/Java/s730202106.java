import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = n;

        int sum = x % 10;
        while (x >= 10) {
            x /= 10;
            sum += x % 10;
        }

        System.out.println(n % sum == 0 ? "Yes" : "No");
    }
}
