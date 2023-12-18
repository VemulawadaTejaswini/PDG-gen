import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = n * (n - 1) / 2;
        int p  = 1;
        for (int i = 2; i <= m; i += 2) {
            p *= (m - i + 2) * (m - i + 1);
            c += p / 2;
        }
        System.out.println(c);
    }
}
