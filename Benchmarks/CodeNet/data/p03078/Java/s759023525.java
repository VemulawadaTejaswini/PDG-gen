import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] xs = new long[x];
        long[] ys = new long[y];
        long[] zs = new long[z];
        for (int i = 0; i < x; i++) {
            xs[i] = sc.nextLong();
        }
        for (int j = 0; j < y; j++) {
            ys[j] = sc.nextLong();
        }
        for (int l = 0; l < z; l++) {
            zs[l] = sc.nextLong();
        }
        int min = Math.min(k, x * y);
        Long[] xySum = new Long[x * y];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                xySum[index] = xs[i] + ys[j];
                index++;
            }
        }
        Arrays.sort(xySum, Comparator.reverseOrder());
        Long[] xyzSum = new Long[min * z];
        index = 0;
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < z; j++) {
                xyzSum[index] = xySum[i] + zs[j];
                index++;
            }
        }
        Arrays.sort(xyzSum, Comparator.reverseOrder());
        for(int i = 0; i < k; i++) {
            System.out.println(xyzSum[i]);
        }
    }
}

