import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() - (i + 1);
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        long b = sum / n;
        if (b < 0) {
            b--;
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[i] - b);
        }
        System.out.println(ans);

        sc.close();
    }
}
