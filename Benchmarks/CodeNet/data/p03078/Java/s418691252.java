import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        Long[] a = new Long[x];
        Long[] b = new Long[y];
        Long[] c = new Long[z];
        for (int i = 0; i < x; i++) a[i] = sc.nextLong();
        for (int i = 0; i < y; i++) b[i] = sc.nextLong();
        for (int i = 0; i < z; i++) c[i] = sc.nextLong();
        Arrays.sort(a, Comparator.reverseOrder());
        Arrays.sort(b, Comparator.reverseOrder());
        Arrays.sort(c, Comparator.reverseOrder());
        Long[] sumAB = new Long[x*y];
        int cntAB = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sumAB[cntAB++] = a[i] + b[j];
            }
        }
        Arrays.sort(sumAB, Comparator.reverseOrder());
        int abIdx = Math.min(k, x*y);
        Long[] sum = new Long[z*abIdx];
        int cnt = 0;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < abIdx; j++) {
                sum[cnt++] = c[i] + sumAB[j];
            }
        }
        Arrays.sort(sum, Comparator.reverseOrder());
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k; i++) ans.append(sum[i] + "\n");
        System.out.println(ans.toString());
        sc.close();
    }

}
