
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
	
	void run(){
		int n = sc.nextInt();
		int y = sc.nextInt();
		
		long x[] = new long[n];
		
		long sum = 0;
		
		for(int i = 0; i  <  n; i++){
			x[i] = sc.nextInt();
		}
		
		boolean used[] = new boolean[n];
		int count = 0;
		long cost = 0;
		
		for(;count < n;){
			
			int left = 0;
			int k2 = 2;
			
			long nc = 0;
			
			for(int i = n-1;  i>=0 ; i--){
				
				if(used[i]){
					continue;
				}
				left = i;
				used[left] = true;
				break;
			}
			
			// pick
			count++;
			nc += y;
			nc += x[left];
			nc += k2*k2 * x[left];

			for(int i = left -1 ; i >= 0; i--){
				if(used[i]){
					continue;
				}
				
				long comp = 5 * x[i] + y*2;
				long now = x[i] * ( 2*k2+1 )   + y;
				
				// pick
				if(now <= comp){
					k2++;
					used[i] = true;
					count++;
					nc += now;
					
				}
			}
			
			// trash
			nc += y;
			cost += nc;
		}
		System.out.println(cost);
	}
	
}
