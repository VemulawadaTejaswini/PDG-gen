import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 入力処理
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int alice = 0;
        int bob = 0;

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (i % 2 == 0) {
                alice+=a[k];
            } else {
                bob+=a[k];
            }
        }

        System.out.println(alice - bob);
    }
}
