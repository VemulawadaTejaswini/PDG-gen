import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 机Aの本の数
        int n = sc.nextInt();
        int[] a = new int[n + 1];

        // 机Bの本の数
        int m = sc.nextInt();
        int[] b = new int[m + 1];

        // 許容時間
        long k = sc.nextLong();
        int ans = 0;

        long asum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            asum += a[i];
        }
        a[n] = 1000000001;

        long bsum = 0;
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            bsum = b[i];
        }
        b[m] = 1000000001;

        int aIndex = 0;
        int bIndex = 0;
        long sumTime = 0;
        if (asum + bsum > k) {
            while (sumTime <= k) {
                if (a[aIndex] < b[bIndex]) {
                    sumTime += a[aIndex++];
                    ans++;
                } else if (a[aIndex] > b[bIndex]) {
                    sumTime += b[bIndex++];
                    ans++;
                } else {
                    int tmpAIndex = aIndex;
                    int tmpBIndex = bIndex;

                    while (tmpAIndex <= n && tmpBIndex <= m) {
                        if (a[tmpAIndex] < b[tmpBIndex]) {
                            sumTime += a[aIndex++];
                            ans++;
                            break;
                        } else if (a[tmpAIndex] > b[tmpBIndex]) {
                            sumTime += b[bIndex++];
                            ans++;
                            break;
                        } else {
                            tmpAIndex++;
                            tmpBIndex++;
                        }
                    }
                }
            }
            
            if (sumTime != k) {
                ans--;
            }
        } else {
            ans = n + m;
        }

        System.out.println(ans);
    }
}
