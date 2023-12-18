import java.util.*;

public class Main {
    static int[][] dp;
    static Dish[] arr;
 	public static void main (String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		dp = new int[t + 1][n + 1];
		arr = new Dish[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = new Dish(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);
		System.out.println(dfw(t, n));
	}
	
	static int dfw(int time, int idx) {
	    if (idx < 1) {
	        return 0;
	    }
	    if (dp[time][idx] != 0) {
	        return dp[time][idx];
	    }
	    int ans = dfw(time, idx - 1);
	    if (time - arr[idx - 1].time > 0) {
	        ans = Math.max(ans, dfw(time - arr[idx - 1].time, idx - 1) + arr[idx - 1].value);
	    } else {
	        ans = Math.max(ans, arr[idx - 1].value);
	    }
	    dp[time][idx] = ans;
	    return ans;
	}
	
	static class Dish implements Comparable<Dish> {
	    int time;
	    int value;
	    
	    public Dish(int time, int value) {
	        this.time = time;
	        this.value = value;
	    }
	    
	    public int compareTo(Dish another) {
	        return another.time - time;
	    }
	}
}


