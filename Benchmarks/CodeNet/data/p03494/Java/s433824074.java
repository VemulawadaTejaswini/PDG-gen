import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        int min = a[0];
        int ans = 0;
        for (int i = 0; i < i - 1; i++) {
            min = Math.min(a[i], a[i + 1]);
        }
        boolean flag = true;
        while (flag) {
            count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    count++;
                    a[i] /= 2;
                } else {
                    flag = false;
                    break;

                }

            }
            if (count == n) {
                ans++;
            }
        }
        System.out.println(ans);

    }
}