import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // input
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int ab = Integer.parseInt(String.valueOf(Math.max(a, b)) + String.valueOf(Math.min(a, b)));
        int bc = Integer.parseInt(String.valueOf(Math.max(b, c)) + String.valueOf(Math.min(b, c)));
        int ca = Integer.parseInt(String.valueOf(Math.max(c, a)) + String.valueOf(Math.min(c, a)));

        // 比較
        int max = ab + c;
        max = Math.max(max, bc + a);
        max = Math.max(max, ca + b);

        // output
        System.out.println(max);

    }
}
