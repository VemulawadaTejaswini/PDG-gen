import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] x = new int[m];
        for (int i = 0; i < x.length; i++) {
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int ans = x[i];
            int c = p[i] - 1;
            for (int j = 0; j < n; j++) {
                if(c != j) {
                    ans += t[j];
                }
            }
            System.out.println(ans);
        }
    }
}