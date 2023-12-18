import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        for (int i = 0; i < x; i++) a[i] = sc.nextLong();
        for (int i = 0; i < y; i++) b[i] = sc.nextLong();
        for (int i = 0; i < z; i++) c[i] = sc.nextLong();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        long[] sumAB = new long[x*y];
        int cntAB = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sumAB[cntAB++] = a[x-1-i] + b[y-1-j];
            }
        }
        Arrays.sort(sumAB);
        int abIdx = Math.min(k, x*y);
        long[] sum = new long[z*abIdx];
        int cnt = 0;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < abIdx; j++) {
                sum[cnt++] = c[z-1-i] + sumAB[abIdx-1-j];
            }
        }
        Arrays.sort(sum);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k; i++) ans.append(sum[k-1-i] + "\n");
        System.out.println(ans.toString());
        sc.close();
    }

}
