import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(a[o1]==a[o2]) {
					return o1-o2;
				}
				return a[o1]-a[o2];
			}
			
		});
		for(int i=0;i<n;i++) {
			ts.add(i);
		}
		int order[] = new int[n];
		for(int i=0;i<n;i++) {
			order[i] = ts.first();
			ts.remove(ts.first());
		}
		long dp[][] = new long[n][n];
		for(int len=0;len<n;len++) {
			for(int i=0;i<n;i++) {
				int j = i+len;
				if(j>n-1) continue;
				if(i==j) {
					dp[i][j] = (long) Math.abs(order[0]-i)*a[order[0]];
				}
				else {
					dp[i][j] = Math.max((long) Math.abs(order[len]-i)*a[order[len]]+dp[i+1][j],(long) Math.abs(order[len]-j)*a[order[len]]+dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[0][n-1]);
	}
}
