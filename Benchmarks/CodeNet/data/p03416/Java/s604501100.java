import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            String s = String.valueOf(i);
            if (new StringBuilder(s).reverse().toString().equals(s)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}