import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] sports = new int[n];
        for (int i = 0; i < n; i++) {
            sports[i] = sc.nextInt();
        }
        int[] counts = new int[n];
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int idx = 0;
            while (sports[idx] > x) {
                idx++;
            }
            counts[idx]++;
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < n; i++) {
            if (max < counts[i]) {
                max = counts[i];
                maxIdx = i + 1;
            }
        }
        System.out.println(maxIdx);
    }
}
