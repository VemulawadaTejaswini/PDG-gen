import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		long[][] dp = new long[30][50];
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			for(int day = 0; day < 30; day++){
				Arrays.fill(dp[day], 0);
			}
			
			for(int i = 0; i < n; i++){
				dp[0][i] = 1L << i;
			}
			
			ArrayList<Set<Integer>> list = new ArrayList<Set<Integer>>();
			for(int day = 0; day < 30; day++){
				list.add(new HashSet<Integer>());
			}
			
			for(int i = 0; i < n; i++){
				final int m = sc.nextInt();
				
				for(int j = 0; j < m; j++){
					final int day = sc.nextInt() - 1;
					
					list.get(day).add(i);
				}				
			}
			
			boolean flag = false;
			for(int day = 1; day < 30; day++){
				for(int person = 0; person < n; person++){
					if(!list.get(day - 1).contains(person)){
						dp[day][person] = dp[day - 1][person];
					}else{
						for(int arrival : list.get(day - 1)){
							dp[day][person] |= dp[day - 1][arrival];
						}
					}
					
					if(dp[day][person] == (1L << n) - 1){
						System.out.println(day);
						flag = true;
						break;
					}
				}
				
				if(flag){
					break;
				}
			}
			
			if(!flag){
				System.out.println(-1);
			}
		}
		
	}
}