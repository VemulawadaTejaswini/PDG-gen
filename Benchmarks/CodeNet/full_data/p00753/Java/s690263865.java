import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static final int MAX = 123456;
	public static final int MAX_2 = MAX * 2;
	public static final int SQ = (int) (Math.ceil(Math.sqrt(MAX_2)));
	
	public static void main(String[] args) {
		int[] prime_count = new int[MAX_2 + 1];
		
		Arrays.fill(prime_count, 1);
		prime_count[0] = prime_count[1] = 0;
		
		for(int i = 0; i <= SQ; i++){
			if(prime_count[i] != 0){
				for(int j = 2 * i; j <= MAX_2; j += i){
					prime_count[j] = 0;
				}
			}
		}
		
		for(int i = 1; i <= MAX_2; i++){
			prime_count[i] += prime_count[i-1];
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(prime_count[2*n] - prime_count[n]);
		}
		
		sc.close();
	}

}