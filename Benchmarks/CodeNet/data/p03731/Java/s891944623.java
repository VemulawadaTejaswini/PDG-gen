import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();

        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        long total = 0;
        for (int i = 1; i < n; i++) {
            total += Math.min(p[i] - p[i - 1], t);
        }
        total += t;

        System.out.println(total);
    }
}
