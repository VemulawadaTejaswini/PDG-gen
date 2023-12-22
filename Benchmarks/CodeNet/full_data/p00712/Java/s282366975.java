
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	
	
	public static int dfs(final int p, final int q, final int a, final int cur_a, final int n, final int pre_div){
		//System.out.println(p + " " + q + " " + a + " " + n + " " + pre_div);
		
		if(n == 0){
			return p == 0 ? 1 : 0;
		}else if(p == 0){
			return 1;
		}
		
		int ret = 0;
		for(int div = pre_div; div <= a; div++){
			if(p * div > q * n){
				//System.out.println("! " + p + " " + q + " " + a + " " + n + " " + pre_div);
				break;
			}else if(p * div - q < 0){
				continue;
			}else if(cur_a * div > a){
				continue;
			}
			
			ret += dfs(p * div - q, q * div, a, cur_a * div,  n - 1, div);
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			final int p = sc.nextInt();
			final int q = sc.nextInt();
			final int a = sc.nextInt();
			final int n = sc.nextInt();
			
			if(p == 0 && q == 0 && a == 0 && n == 0){
				break;
			}
			
			System.out.println(dfs(p, q, a, 1, n, 1));
		}
		
	}
}