import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();

        int sa = Integer.MAX_VALUE;
        int num = 0;

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int k = (int) (t - h * 0.006);
            if (sa > a - k) {
                sa = a - k;
                num = i + 1;
            }
        }

        sc.close();

        System.out.print(num);

    }
}