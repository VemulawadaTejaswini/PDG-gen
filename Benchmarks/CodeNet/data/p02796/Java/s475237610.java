import java.util.*;
import java.io.*;

public class Main {
    static Robot[] robots;
    static HashMap<Integer, Integer>[] dp;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        robots = new Robot[n];
        dp = new HashMap[n];
        for (int i = 0; i < n; i++) {
            robots[i] = new Robot(br.readLine());
            dp[i] = new HashMap<Integer, Integer>();
        }
        Arrays.sort(robots);
        System.out.println(dfw(n - 1, Integer.MAX_VALUE));
    }
    
    static int dfw(int idx, int right) {
        if (idx < 0) {
            return 0;
        }
        if (dp[idx].containsKey(right)) {
            return dp[idx].get(right);
        }
        int ans = dfw(idx - 1, right);
        if (right >= robots[idx].right) {
            ans = Math.max(ans, dfw(idx - 1, robots[idx].left) + 1);
        }
        dp[idx].put(right, ans);
        return ans;
    }
    
    static class Robot implements Comparable<Robot> {
        int point;
        int length;
        int left;
        int right;
        
        public Robot (String arg) {
            String[] arr = arg.split(" ", 2);
            point = Integer.parseInt(arr[0]);
            length = Integer.parseInt(arr[1]);
            left = point - length;
            right = point + length;
        }
        
        public int compareTo(Robot another) {
            return point - another.point;
        }
    }
}
