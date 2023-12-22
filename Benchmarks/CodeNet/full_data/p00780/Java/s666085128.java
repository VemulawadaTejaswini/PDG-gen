import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MAX = 32768;
		
		boolean is_prime[] = new boolean[MAX + 1];
		
		for(int i = 2; i <= MAX; i++){
			is_prime[i] = true;
		}
		
		for(int i = 2; i <= Math.sqrt(MAX); i++){
			if(is_prime[i]){
				for(int j = i * 2; j <= MAX; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int count = 0;
			
			for(int i = 2; i <= n; i++){
				if(!is_prime[i]){continue;}
				
				for(int j = i; (i + j) <= n; j++){
					if(!is_prime[j] || (i + j) != n){continue;}
					
					count++;
				}
			}
			
			System.out.println(count);
		}
		
	}

}