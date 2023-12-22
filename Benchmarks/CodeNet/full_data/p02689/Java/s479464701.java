import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmp = h[i];
            boolean bb = false;
            for (int j = 0; j < m; j++) {
                if(a[j] == i + 1) {
                    int tmp2 = b[j];
                    if(tmp > tmp2) {
                        bb = true;
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                if(b[j] == i + 1) {
                    int tmp2 = a[j];
                    if(tmp > tmp2) {
                        bb = true;
                    }
                }
            }
            if(bb) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}