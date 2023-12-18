import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] imos = new int[s.length() + 1];
        for (int i = 1; i < s.length() + 1; i++) {
            imos[i] = imos[i - 1] ^ (int) Math.pow(2, s.charAt(i - 1) - 'a');
        }
        int[] kaibuns = new int[27];
        for (int i = 0; i < 26; i++) {
            kaibuns[i + 1] = 1 << i;
        }
        int[] dp = new int[(int) Math.pow(2, 26)];
        Arrays.fill(dp, 1 << 26);
        dp[0] = 0;
        for (int i = 1; i < s.length() + 1; i++) {
            int min = 1 << 26;
            for (int j = 0; j < 27; j++) {
                min = Math.min(min, dp[imos[i] ^ kaibuns[j]] + 1);
            }
            dp[imos[i]] = min;
        }
        System.out.println(dp[imos[s.length()]]);
    }
}
