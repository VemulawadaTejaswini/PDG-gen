import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        int[][] c = new int[M][3];
        int mina = Integer.MAX_VALUE;
        int minb = Integer.MAX_VALUE;
        for (int i = 0; i < A; i++) {
            a[i] = sc.nextInt();
            if(a[i] < mina) mina = a[i];
        }
        for (int i = 0; i < B; i++) {
            b[i] = sc.nextInt();
            if(b[i] < minb) minb = b[i];
        }
        for (int i = 0; i < M; i++) {
            c[i][0] = sc.nextInt()-1;
            c[i][1] = sc.nextInt()-1;
            c[i][2] = sc.nextInt();
        }
        int ans = mina + minb;
        for (int i = 0; i < M; i++) {
            int t = a[c[i][0]] + b[c[i][1]] - c[i][2];
            if(t < ans) ans = t;
        }
        System.out.println(ans);
        sc.close();

    }

}
