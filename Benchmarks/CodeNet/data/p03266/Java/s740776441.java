import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;

        for (int a = k; a <= n; a += k) {
            for (int b = k; b <= n; b += k) {
                for (int c = k; c <= n; c += k) {
                    cnt++;
                }
            }
        }

        if (k % 2 == 0) {
            int i = k / 2;
            for (int a = i; a <= n; a += k) {
                for (int b = i; b <= n; b += k) {
                    for (int c = i; c <= n; c += k) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
