import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        boolean ans = false;
        for (int i = 0; i <= n && !ans; i++) {
            long min = - d * i  + c * (n - i - 1);
            long max = - c * i + d * (n - i - 1);
            if (b - a >= min && b - a <= max)
                ans = true;
        }
        if (ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
