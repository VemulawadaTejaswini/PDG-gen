import java.util.Scanner;

 public class Main {
    static int n;
    static int k;
    static int[] w;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        w = new int[n];

        int minP = 0;
        int maxP = (int) 1E9;
        for (int i = 0; i < n; i++)
            w[i] = sc.nextInt();

        // f(p) が初めてn以上になるpを求める
        int midP = 0;
        while (maxP > minP) {
            midP = (maxP + minP) / 2;
            int m = f(midP);
            
            if (m >= n) 
                maxP = midP;
            else
                minP = midP + 1;
        }
        System.out.println(maxP);
    }
    
    // 最大積載量pのトラックk台に載せられるwの要素の個数
    static int f(int p) {
        int i = 0;
        for (int iK = 0; iK < k; iK++) {
            int pK = 0;
            while (pK + w[i] <= p) {
                pK += w[i];
                i++;
                if (i == n)
                    return n;
            }
        }
        return i;
    }
}
