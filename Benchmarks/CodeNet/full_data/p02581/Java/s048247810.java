import java.util.*;

public class Main {
    static int[] arr;
    static int[][][] dp;
    static int n;
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	arr = new int[n * 3];
    	for (int i = 0; i < n * 3; i++) {
    	    arr[i] = sc.nextInt() - 1;
    	}
    	dp = new int[n][n][n];
    	for (int[][] arr1 : dp) {
    	    for (int[] arr2 : arr1) {
    	        Arrays.fill(arr2, -1);
    	    }
    	}
    	System.out.println(dfw(arr[0], arr[1], 0));
    }
    
    static int dfw(int first, int second, int idx) {
        if (dp[first][second][idx] >= 0) {
            return dp[first][second][idx];
        }
        if (dp[second][first][idx] >= 0) {
            return dp[second][first][idx];
        }
        if (idx == n - 1) {
            if (first == second && first == arr[3 * n - 1]) {
                return 1;
            } else {
                return 0;
            }
        }
        int[] tmp = new int[]{first, second, arr[idx * 3 + 2], arr[idx * 3 + 3], arr[idx * 3 + 4]};
        Arrays.sort(tmp);
        if (tmp[0] == tmp[1] && tmp[1] == tmp[2]) {
            return dp[first][second][idx] = dfw(tmp[3], tmp[4], idx + 1) + 1;
        }
        if (tmp[1] == tmp[2] && tmp[2] == tmp[3]) {
            return dp[first][second][idx] = dfw(tmp[0], tmp[4], idx + 1) + 1;
        }
        if (tmp[2] == tmp[3] && tmp[3] == tmp[4]) {
            return dp[first][second][idx] = dfw(tmp[0], tmp[1], idx + 1) + 1;
        }
        int value = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                value = Math.max(value, dfw(tmp[i], tmp[j], idx + 1));
            }
        }
        return dp[first][second][idx] = value;
    }
}

