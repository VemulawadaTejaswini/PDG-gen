import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 1000; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] monstars_x = new int[5][MAX];
		int[][] monstars_y = new int[5][MAX];
		int[] monstars_count = new int[5];
		int[][] monstars_dp = new int[4][MAX];
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int s_x = -1, s_y = -1, g_x = -1, g_y = -1;
			
			Arrays.fill(monstars_count, 0);
			for(int i = 0; i < h; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < w; j++){
					if('0' <= input[j] && input[j] <= '9'){
						final int type = input[j] - '0' - 1;
						monstars_x[type][monstars_count[type]] = j;
						monstars_y[type][monstars_count[type]] = i;
						monstars_count[type]++;
					}else if('S' == input[j]){
						s_x = j;
						s_y = i;
					}else if('G' == input[j]){
						g_x = j;
						g_y = i;
					}
				}
			}
			
			int min_count = Integer.MAX_VALUE;
			int min_hand = Integer.MAX_VALUE;
			
			for(int start = 0; start < 5; start++){
				for(int count = 0; count < 4; count++){
					Arrays.fill(monstars_dp[count], Integer.MAX_VALUE);
				}
				
				final int s_next = (start + 1) % 5;
				for(int monstar_num = 0; monstar_num < monstars_count[s_next]; monstar_num++){
					monstars_dp[0][monstar_num] =
							Math.abs(s_x - monstars_x[s_next][monstar_num]) + 
							Math.abs(s_y - monstars_y[s_next][monstar_num]);
					
				}
				//System.out.println(Arrays.toString(monstars_x[start]));
				//System.out.println(Arrays.toString(monstars_y[start]));
				
				//System.out.println(Arrays.toString(monstars_dp[0]));
				
				for(int dp = 1; dp < 4; dp++){
					final int next = (start + 1 + dp) % 5;
					final int n_prev = (start + dp) % 5;
					
					for(int monstar_num = 0; monstar_num < monstars_count[next]; monstar_num++){
						for(int prev_monstar_num = 0; prev_monstar_num < monstars_count[n_prev]; prev_monstar_num++){
						monstars_dp[dp][monstar_num] =
								Math.min(monstars_dp[dp][monstar_num],
										monstars_dp[dp-1][prev_monstar_num] + 
											Math.abs(monstars_x[next][monstar_num] - monstars_x[n_prev][prev_monstar_num]) + 
											Math.abs(monstars_y[next][monstar_num] - monstars_y[n_prev][prev_monstar_num]));
						}
					}
					//System.out.println(Arrays.toString(monstars_dp[dp]));
				}
				//System.out.println("----------------------------------------");
				final int last = (start + 4) % 5;
				for(int monstar_num = 0; monstar_num < monstars_count[last]; monstar_num++){
					final int cost = monstars_dp[3][monstar_num] + 
							Math.abs(g_x - monstars_x[last][monstar_num]) + 
							Math.abs(g_y - monstars_y[last][monstar_num]);
					
					if(min_count > cost){
						min_hand = start;
						min_count = cost;
					}
				}
				//sc.next();
			}
			
			if(min_count == Integer.MAX_VALUE){
				System.out.println("NA");
			}else{
				System.out.println((min_hand + 1) + " " + min_count);
			}
		}
	}
}