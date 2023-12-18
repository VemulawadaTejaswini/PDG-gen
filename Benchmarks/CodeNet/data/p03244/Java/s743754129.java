import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] odd = new int[100000];
        int[] even = new int[100000];
        Arrays.fill(odd, 0);
        Arrays.fill(even, 0);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                odd[sc.nextInt()]++;
            } else {
                even[sc.nextInt()]++;
            }
        }
        int max_o = 0;
        int max_even = 0;
        int c = 0;
        for (int i = 0; i < 100000; i++) {
            if (odd[i] >= even[i] && max_o < odd[i]) {
                even[i] = 0;
            } else if (odd[i] < even[i] && max_even < even[i]) {
                odd[i] = 0;
            }
            max_o = Math.max(max_o, odd[i]);
            max_even = Math.max(max_even, even[i]);
        }
        System.out.println(n - max_even - max_o);
    }
}