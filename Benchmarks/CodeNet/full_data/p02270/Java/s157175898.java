import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] w = new int[n];

        long minP = 0;
        long maxP = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            minP = Math.max(minP, w[i]);
            maxP += w[i];
        }

        // kは固定して、pをminPからmaxPまで調べる。
        // tempN = f(p, k, w) が初めてn以上になるpを求める。
        long midP = 0;
        while (maxP > minP) {
            midP = (maxP + minP) / 2;
            int tempN = f(midP, k, w);
            if (tempN > n) maxP = midP - 1;
            else if (tempN < n) minP = midP + 1;
            else {
                while (tempN == n) {
                    midP--;
                    tempN = f(midP, k, w);
                }
                midP++;
                maxP = minP = midP;
            }
        }
        System.out.println(midP);
    }
    
    // 最大積載量pのトラックk台に、wの要素はいくつ載せられるか?
    static int f(long p, int k, int[] w) {
        int i = 0;
        for (int iK = 0; iK < k; iK++) {
            int pK = 0;
            while (pK + w[i] <= p) {
                pK += w[i];
                i++;
                if (i == w.length) return w.length;
            }
        }
        return i;
    }
}
