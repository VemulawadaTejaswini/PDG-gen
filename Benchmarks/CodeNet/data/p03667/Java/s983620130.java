import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n + 1];
        int[] counts = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = sc.nextInt();
            counts[nums[i]]++;
        }
        int[] imos = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            imos[Math.max(i - counts[i], 0)]++;
            imos[i]--;
        }
        int zeros = -1; //imos[n] == 0のため
        if (imos[0] == 0) {
            zeros++;
        }
        for (int i = 1; i <= n; i++) {
            imos[i] += imos[i - 1];
            if (imos[i] == 0) {
                zeros++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int idx = sc.nextInt();
            int x = nums[idx];
            if (x - counts[x] >= 0) {
                imos[x - counts[x]]--;
                if (imos[x - counts[x]] == 0) {
                    zeros++;
                }
            }
            counts[x]--;
            int y = sc.nextInt();
            nums[idx] = y;
            counts[y]++;
            if (y - counts[y] >= 0) {
                if (imos[y - counts[y]] == 0) {
                    zeros--;
                }
                imos[y - counts[y]]++;
            }
            sb.append(zeros).append("\n");
        }
        System.out.print(sb);
    }
}
