import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] fq = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            fq[a[i]]++;
        }
        int c = 0;
        for (int i = 1; i <= n; ++i) {
            c += (fq[i] >= 2) ? (fq[i] * (fq[i] - 1)) / 2 : 0;
        }
        for (int i = 0; i < n; ++i) {
            if (fq[a[i]] >= 2) {
                System.out.println(c - (fq[a[i]] - 1));
            }
            else {
                System.out.println(0);
            }
        }
    }
}
