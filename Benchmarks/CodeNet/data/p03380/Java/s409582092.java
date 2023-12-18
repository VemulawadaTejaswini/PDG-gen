import java.util.*;

public class Main {
    static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a);
        int ans;
        int index = binary_search(a[N-1]/2);
        if (index==0) {
            ans = 0;
        } else {
            ans = Math.abs(index-(double)N/2) < Math.abs(index-1-(double)N/2) ? index : index-1;
        }
        System.out.println(a[N-1] + " " + a[ans]);
    }
    public static boolean isOK(int index, int key) {
        if (a[index] >= key) return true;
        else return false;
    }

    public static int binary_search(int key) {
        int left = -1;
        int right = a.length;

        while (right - left > 1) {
            int mid = left + (right - left) / 2;

            if (isOK(mid, key)) right = mid;
            else left = mid;
        }
        return right;
    }
}