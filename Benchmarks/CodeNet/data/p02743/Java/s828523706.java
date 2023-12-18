import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        long res = a * a - 2 * (a * b + b * c + c * a) + b * b + c * c;
        System.out.println(res > 0 ? "Yes" : "No");
    }
}
