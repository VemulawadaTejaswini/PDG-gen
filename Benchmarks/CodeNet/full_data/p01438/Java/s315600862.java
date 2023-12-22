import java.awt.geom.*;
import java.io.*;
import java.util.*;


public class Main {
	//0128 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			long [] llist = new long[n];
			int [] bitlist = new int[n];
			for(int i = 0; i < n; i++){
				int m = sc.nextInt();
				llist[i] = sc.nextLong();
				int nowbit = 0;
				for(int j = 0; j < m; j++){
					int s = sc.nextInt() - 6;
					int t = sc.nextInt() - 6;
					for(int k = s; k < t; k++){
						nowbit= (nowbit | (1 << k));
					}
				}
				bitlist[i] = nowbit;
			}
			int len = (1 << (22 - 6));
			long [] dp = new long[len];
			long max = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < len; j++){
					if((bitlist[i] & j) == 0){
						int next = bitlist[i] | j;
						long value = dp[j] + llist[i];
						dp[next] = Math.max(dp[next], value);
						max = Math.max(max, value);
					}
				}
			}
			
			System.out.println(max);
		}
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}