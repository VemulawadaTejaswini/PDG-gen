import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] split = line.split(" ");
		int N = Integer.parseInt(split[0]);
		int A = Integer.parseInt(split[1]);
		
		line = br.readLine();
		split = line.split(" ");
		
		int[] arr = new int[N];		
		for(int i = 0; i<N; i++) arr[i] = Integer.parseInt(split[i]);
		
		int[] dp =  new int[50*N+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		int max = 0;
		
		long total = 0;
		
		for(int i = 0; i < N; i++){			
			for(int j = max; j>=0; j--){
				if(dp[j] != -1){
					int index = j+arr[i];
					dp[index] = dp[j]+1;
					if((A*dp[index]) == index){
						total++;
					}
					max = Math.max(max, index);
				}
			}
		}		
		System.out.println(total);
	}
}