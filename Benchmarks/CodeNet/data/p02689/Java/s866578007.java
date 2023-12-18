import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 100010;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[N];
        int[] ma = new int[N];

        for(int i = 1; i < n; i++) {
                h[i] = sc.nextInt();
                ma[i] = 0;
        }

        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ma[a] = Math.max(ma[a], h[b]);
            ma[b] = Math.max(ma[b], h[a]);
        }

        int res = 0;
        for(int i = 1; i <=n; i++) {
             if(h[i]>ma[i]) {
                res++;
            }
        }
        System.out.println(res);
    }
}
