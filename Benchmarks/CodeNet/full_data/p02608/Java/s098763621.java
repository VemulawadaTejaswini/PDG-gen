import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		int[] dp = new int[n+1];
		for(int i =1;i<n;i++){
			for(int j = 1;j<n;j++){
				for(int k = 1;k<=n;k++){
					long p = ((i+j)*(i+j) + (j+k)*(k+j) + (i+k)*(i+k))/2; 
					if( p>n){
						break;
					}
					else{
						dp[(int)p]++;
					}
				}
			}
		}
		for(int i = 1;i<=n;i++){
			writer.write(dp[i]+"\n");
		}
		writer.flush();
	}
}
