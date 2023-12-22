import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	public static final int MAX = 20;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] req_bit = new int[MAX];
		int[] amounts = new int[MAX];
		int[] DP = new int[1 << MAX];
		
		while(true){
			final int n = sc.nextInt();
			final int U = sc.nextInt();
			
			if(n == 0 && U == 0){
				break;
			}
			
			for(int i = 0; i < n; i++){
				amounts[i] = sc.nextInt();
				
				final int k = sc.nextInt();
				int bit = 0;
				for(int j = 0; j < k; j++){
					bit |= 1 << (sc.nextInt());
				}
				
				req_bit[i] = bit;
			}
			
			Arrays.fill(DP, INF);
			DP[0] = 0;
			
			final int bit_size = 1 << n;
			for(int bit = 0; bit < bit_size; bit++){
				if(DP[bit] >= INF){
					continue;
				}
				
				for(int next = 0; next < n; next++){
					if((bit & (1 << next)) != 0){
						continue;
					}else if((bit & (req_bit[next])) != req_bit[next]){
						continue;
					}
					
					DP[bit | (1 << next)] = Math.min(DP[bit | (1 << next)], DP[bit] + amounts[next]);
				}
			}
			/*
			for(int i = 0; i < bit_size; i++){
				System.out.println(Integer.toBinaryString(i) + "\t : " + DP[i]);
			}
			*/
			int min = INF;
			for(int i = 0; i < bit_size; i++){
				if(DP[i] >= U && DP[i] < INF){
					//System.out.println(Integer.toBinaryString(i) + "\t : " + DP[i]);
					min = Math.min(min, Integer.bitCount(i));
				}
			}
			
			System.out.println(min);
		}
		
	}

}