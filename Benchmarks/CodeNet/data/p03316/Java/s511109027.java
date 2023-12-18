import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int N = n;
        int sum = 0;
        while (0 < n) {
            sum += n % 10;
            n /= 10;
        }

        if(sum % N == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
