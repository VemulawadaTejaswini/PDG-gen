import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);

        int mFoundIndex = 0, nFoundIndex = 0;
        long sum = 1;
        int num = n * m;
        while (num > 0) {
            int aResult = Arrays.binarySearch(a, num);
            int bResult = Arrays.binarySearch(b, num);
            if(aResult >= 0 && bResult >= 0) {
                mFoundIndex++;
                nFoundIndex++;
            } else if(aResult >= 0) {
                sum *= mFoundIndex;
                nFoundIndex++;
            } else if(bResult >= 0) {
                sum *= nFoundIndex;
                mFoundIndex++;
            } else {
                sum *= (nFoundIndex * mFoundIndex - (n * m - num));
            }
            num--;
            sum %= MOD;
        }
        System.out.println(sum);
    }
}