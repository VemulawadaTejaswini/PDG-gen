import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] A;
    static int[] B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N];
        B = new int[N];
        for(int i = 0; i < N; i++) A[i] = sc.nextInt();
        for(int i = 0; i < N; i++) B[i] = sc.nextInt();

        int ans = 0;
        int[] amods, bmods;
        for(int b = 0; b < 29; b++) {
            int t = 1 << b;
            amods = new int[N];
            for(int i = 0; i < N; i++) amods[i] = A[i]%(2*t);
            bmods = new int[N];
            for(int i = 0; i < N; i++) bmods[i] = B[i]%(2*t);
            Arrays.sort(bmods);

            int count = 0;
            for(int ai: amods) {
                int i1 = binarySearch(bmods, t - ai);
                int i2 = binarySearch(bmods, 2*t - ai);
                int i3 = binarySearch(bmods, 3*t - ai);
                count += (i2 - i1) + (N - i3);
            }
            if(count%2 == 1) {
                ans |= t;
            }
        }
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target) {
        int ok = N;
        int ng = -1;
        while (ok - ng > 1) {
            int m = (ok+ng) / 2;
            if (arr[m] >= target) {
                ok = m;
            } else {
                ng = m;
            }
        }
        return ok;
    }

}