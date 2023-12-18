import java.util.*;
import java.io.*;

public class Main {


	public static void main(String[] args) {
		Main answer = new Main();
		answer.solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String L = sc.nextLine();

		int N = S.length();
		int M = L.length();

		int [][] dp = new int[N+1][M+1];

	 

		for(int i=N-1;i>=0;i--){
			for(int j=M-1;j>=0;j--){
				char a = S.charAt(i);
				char b = L.charAt(j);

				if (a==b) {
					dp[i][j] = 1+ dp[i+1][j+1];					 
				} else{
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		
		//for(int i=0;i<=N;i++) System.out.println(Arrays.toString(dp[i])); 

		int i=0,j=0;
		while(i<N && j<M) {
			char a = S.charAt(i);
			char b = L.charAt(j);			  
			if (a==b) {
				System.out.printf("%c",a);
				i++;
				j++;
			} else {
				if (dp[i+1][j]>=dp[i][j+1]) i++;
				else j++;
			}
		}


 
	} 
}