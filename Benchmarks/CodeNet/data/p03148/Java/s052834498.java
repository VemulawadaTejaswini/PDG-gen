import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] t = new int[n];
		int[] d = new int[n];
		
		for(int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		
		long[][] dp = new long[n][k]; // i+1個目までからj+1個
		ArrayList<ArrayList<HashSet<Integer>>> variety = new ArrayList<ArrayList<HashSet<Integer>>>();
		
		
		for(int j = 0; j < k; j++) {
			variety.add(new ArrayList<HashSet<Integer>>());
			for(int i = 0; i < n; i++) {
				variety.get(j).add(new HashSet<Integer>());
				if(i == 0) {
					dp[0][j] = d[0] + 1;
					variety.get(j).get(i).add(t[0]);
				}else if(j == 0){
					if(dp[i-1][j] < d[i] + 1) {
						dp[i][j] = d[i] + 1;
						variety.get(j).get(i).add(t[i]);
					}else {
						dp[i][j] = dp[i-1][j];
						variety.get(j).set(i, variety.get(j).get(i - 1));
					}
				}else {
					boolean newNeta = !variety.get(j - 1).get(i - 1).contains(t[i]);
					int newtaste = -1;
					if(newNeta) {
						newtaste = d[i] + (int) Math.pow(variety.get(j - 1).get(i - 1).size() + 1, 2)
						 - (int) Math.pow(variety.get(j - 1).get(i - 1).size(), 2);
					}else {
						newtaste = d[i];
					}
					
					if(dp[i-1][j] <= dp[i-1][j-1] + newtaste) {
						dp[i][j] = dp[i-1][j-1] + newtaste;
						
						variety.get(j).set(i, variety.get(j - 1).get(i - 1));
						if(newNeta) {
							variety.get(j).get(i).add(t[i]);
						}
					}else {
						dp[i][j] = dp[i-1][j];
						variety.get(j).set(i, variety.get(j).get(i - 1));
					}
				}
			}
		}
		
		System.out.println(dp[n-1][k-1]);
	}
}