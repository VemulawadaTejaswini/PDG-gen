import java.util.*;

public class Main {
	
	
    public static int returnMaxPackage(long p, int n, int k, int[] packages) {
        int i = 0;
        for (int j=0; j < k; j++) {
            long s = 0;
            while (s + packages[i] <= p) {
                s += packages[i];
                i++;
                if (i == n) return n;
            }
        }

        return i;
    }

    public static int searchMinP(int n, int k, int[] packages) {
        long left = 0;
        long right = 100000 * 10000;
        long mid;

        while (right - left > 1) {
            mid = (left + right) / 2;
            int v = returnMaxPackage(mid, n, k, packages);

            if (v >= n) {
                right = mid;
            } else {
                left = mid;
            }
        }

        return (int)right;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] packages = new int[n];
        for (int i=0; i<n; i++) {
            packages[i] = Integer.parseInt(sc.next());
        }


        int ans = searchMinP(n, k, packages);

        System.out.println(ans);
    }
}
