import java.util.*;

// ABC 6-C
// http://abc006.contest.atcoder.jp/tasks/abc006_3
 
public class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		
		long sum = 0;
		long answer = 0;
		
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			
//			if (i > 0) {
				if (sum < 0 && sum + a < 0) {
					answer += 1 + Math.abs(sum + a);
					sum = 1;
				} else if (sum > 0 && sum + a > 0) {
					answer += 1 + sum + a;
					sum = -1;
				} else if (sum + a == 0) {
					answer++;
					if (sum < 0) {
						sum = 1;
					} else {
						sum = -1;
					}
				} else { 
					sum += a;
				}
//			} else {
//				sum += a;
//			}
		}
		
		System.out.println(answer);
	}
}