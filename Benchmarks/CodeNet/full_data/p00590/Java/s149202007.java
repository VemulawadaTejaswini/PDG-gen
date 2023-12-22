import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] is_prime = new boolean[10001];
		
		for(int i = 2; i < 10001; i++){
			is_prime[i] = true;
		}
		
		for(int i = 2; i <= 100; i++){
			if(is_prime[i]){
				for(int j = 2*i; j <= 10000; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		while(sc.hasNext()){
			final int n = sc.nextInt();
			
			int count = 0;
			
			for(int i = 1; i <= n; i++){
				if(is_prime[i] && is_prime[n + 1 - i]){
					count++;
				}
			}
			
			System.out.println(count);
		}

	}

}