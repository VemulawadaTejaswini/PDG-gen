import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < m; i++) {
            arr[in.nextInt() - 1]++;
            arr[in.nextInt()]--;
        }
        for (int i = 1; i < n + 1; i++) {
            arr[i] += arr[i - 1];
        }
        int ans = 0;
        for(int val : arr) {
            if(val == m) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
