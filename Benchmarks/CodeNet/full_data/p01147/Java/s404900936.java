import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static String connect(String pre, String post){
		char[] pre_array = pre.toCharArray();
		char[] post_array = post.toCharArray();
		
		int min = Math.min(pre_array.length, post_array.length);
		
		int over = 0;
		for(int range = 0; range <= min; range++){
			boolean flag = true;
			for(int pos = 0; pos < range; pos++){
				//System.out.println(pre_array[pre_array.length - (range - pos)] + " " + post_array[pos]);
				
				if(pre_array[pre_array.length - (range - pos)]
					!= post_array[pos]){
						flag = false;
						break;
					}
			}
			
			//System.out.println(range);
			
			if(flag){
				over = Math.max(over, range);
			}
		}
		
		//System.out.println(pre+ " " + post.substring(over));
		
		return pre.concat(post.substring(over));
	}
	
	public static final int MAX = 10;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] dp = new String[1 << MAX][MAX];
		
		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}

			String[] array = new String[N];
			for (int i = 0; i < N; i++) {
				array[i] = sc.next();
			}
			
			Arrays.sort(array);
			
			final int limit = 1 << N;
			
			for(int S = 0; S < limit; S++){
				for(int i = 0; i < N; i++){
					dp[S][i] = null;
				}
			}
			
			for(int i = 0; i < N; i++){
				dp[0][i] = "";
				dp[1 << i][i] = array[i];
			}
			
			for(int S = 0; S < limit; S++){
				for(int i = 0; i < N; i++){
					if((S & (1 << i)) == 0){
						continue;
					}
					
					for(int j = 0; j < N; j++){
						//System.out.println(dp[S][i]);
						final String consist = connect(dp[S][i], array[j]);
						
						if(dp[S | (1 << j)][j] == null ||
								dp[S | (1 << j)][j].length() > consist.length()){
							dp[S | (1 << j)][j] = consist;
						}
					}
				}
			}
			
			String min_string = null;
			for(int i = 0; i < N; i++){
				if(min_string == null || min_string.length() > dp[limit - 1][i].length()){
					min_string = dp[limit - 1][i];
				}
			}
			
			System.out.println(min_string);
		}

		sc.close();
	}

}