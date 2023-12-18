import java.util.*;

// ABC 44-C
// http://abc044.contest.atcoder.jp/tasks/arc060_a

public class Main {
	
	static int n;
	static int a;
	static int[] num;
	static long answer;
	
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);

	    n = in.nextInt();
	    a = in.nextInt();
	    num = new int[n];
	    for (int i = 0; i < n; i++) {
	    	num[i] = in.nextInt();
	    }
	    
	    answer = 0;
	    
	    for (int i = 1; i < 1 << n; i++) {
	    	solve(i);
	    }
	    
	    System.out.println(answer);
	}
	
	public static void solve(int x) {
		int sum = 0;
		int divideBy = 0;
		for (int i = 0; i < n; i++) {
			if ((x & (1 << i)) > 0) {
				sum += num[i];
				divideBy++;
			}
		}
		
		if (sum % divideBy == 0 && sum / divideBy == a) {
			answer++;
		}
	}
}
