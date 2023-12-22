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
            
            if (tempN < n) {
                maxP = midP - 1;
                
            } else if (tempN > n) {
                minP = midP + 1;
            } else {
                while (tempN == n && midP >= minP) {
                    midP--;
                    tempN = f(midP, k, w);
                }
                midP++;
                break;
            }
        }
        System.out.println(midP);
    }
    
    static int f(long p, int k, int[] w) {
        int  remainK = k;
        long remainP = p; // トラック1台あたりの容量
        
        int i = 0;
        for (i = 0; i < w.length; i++) {
            if (remainP < w[i]) {
                remainK--;
                remainP = p - w[i];
            } else {
                remainP -= w[i];
            }
            if (remainK <= 0) {
                break;
            }
        }
        return i;
    }
}
