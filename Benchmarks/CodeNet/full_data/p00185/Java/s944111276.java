import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		boolean[] is_prime = new boolean[1000002];
		is_prime[0] = is_prime[1] = false;
		for(int i = 2; i < 1000002; i++){
			is_prime[i] = true;
		}
		
		
		for(int i = 2; i < 1001; i++){
			for(int j = (i + 1); j < 1000002; j++){
				if(is_prime[j] == false){
					continue;
				}else if(j % i == 0){
					is_prime[j] = false;
				}
			}
		}
		
		while(true){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			
			int count = 0;
			int max = n / 2;
			for(int i = 2; i <= max; i++){
				if(!is_prime[i]){
					continue;
				}else if(!is_prime[n - i]){
					continue;
				}else{
					count++;
				}
			}
			
			
			System.out.println(count);
		}
		
	}
	
	
}