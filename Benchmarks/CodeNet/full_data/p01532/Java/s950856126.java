import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int T = sc.nextInt();
		final int H = sc.nextInt();
		
		final int L = sc.nextInt();
		
		int[] ts = new int[N];
		int[] hs = new int[N];
		for(int i = 0; i < N; i++){
			ts[i] = sc.nextInt();
			hs[i] = sc.nextInt();
		}
		
		int store_t = T;
		int store_h = H;
		int cur_p = 0;
		
		while(true){
			boolean abort = false;
			int break_number = 0;
			
			for(int i = 0; i < N; i++){
				//no money
				if(ts[i] == 0 && hs[i] == 0){
					abort = true;
					break_number = i;
					break;
				}
				
				//pay
				if(ts[i] > 0){
					ts[i]--;
					store_t++;
					cur_p += 10;
				}else if(hs[i] > 0){
					hs[i]--;
					store_h++;
					cur_p += 100;
				}
				
				//over limit
				if(store_t > L){
					abort = true;
					break_number = i;
					break;
				}
				
				//retrun money
				if(cur_p >= 90){
					final int rest = cur_p - 90;
					
					final int rest_h = rest / 100;
					final int rest_t = rest % 100;
					
					final int t_to_h = (store_t - rest_t) / 10;
					
					final int h_ret = Math.max(rest_h - t_to_h, 0);
					final int t_ret = Math.max(rest_h - h_ret, 0) * 10 + rest_t;
					
					//final int h_ret = rest / 100;
					//final int t_ret = rest % 100;
					
					//not return
					if(h_ret > store_h || t_ret > store_t){
						abort = true;
						break_number = i;
						break;
					}
					
					//remove_store
					store_t -= t_ret;
					store_h -= h_ret;
					//return
					ts[i] += t_ret;
					hs[i] += h_ret;
					//cur_p
					cur_p = 0;
				}
			}
			
			if(abort){
				System.out.println(break_number + 1);
				break;
			}
		}
	}
}