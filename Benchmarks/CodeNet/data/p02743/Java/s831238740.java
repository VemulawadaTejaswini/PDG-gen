import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(0 < a * a - 2 * a * b + b * b - 2 * b * c + c * c - 2 * c * a ? "Yes" : "No");
    }
}
