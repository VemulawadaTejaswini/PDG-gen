import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if(n / k == 1) {
            System.out.println(1);
            return;
        }
        int ans = n / (k - 1);
        if(n % (k - 1) != 0) ans++;
        System.out.println(ans);

    }
}