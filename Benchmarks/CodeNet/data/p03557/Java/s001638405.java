
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(scan.next());
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(scan.next());
        }
        scan.close();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int[] bc = new int[n];
        for (int i = 0; i < n; i++) {
            int okMinIndex = binarySearch(c, b[i]);
            bc[i] = n - okMinIndex;
        }

        int[] abc = new int[n];
        abc[n - 1] = bc[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            abc[i] = abc[i + 1] + bc[i];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int okMinIndex = binarySearch(b, a[i]);
            if (okMinIndex == n) {
                continue;
            }
            ans += abc[okMinIndex];
        }

        System.out.println(ans);
    }

    private static int binarySearch(int[] array, int key) {
        int ng = -1;
        int ok = array.length;

        while (ok - ng > 1) {
            int mid = (ok + ng) / 2;
            if (array[mid] > key) {
                ok = mid;
            } else {
                ng = mid;
            }
        }

        return ok;
    }

}
