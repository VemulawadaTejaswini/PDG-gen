import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 30000;
	public static final int SQRT = (int)(Math.ceil(Math.sqrt(MAX)));
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		boolean[] is_prime = new boolean[MAX + 1];
		Arrays.fill(is_prime, 2, MAX + 1, true);
		for(int i = 2; i <= SQRT; i++){
			if(is_prime[i]){
				for(int j = i * 2; j <= MAX; j += i){
					is_prime[j] = false;
				}			
			}
		}
		
		
		while (true) {

			final int T = sc.nextInt();
			
			if(T == 0){ break; }
			
			long count = 0;
			for(int fst = T; fst >= 2; fst--){
				if(!is_prime[fst]){ continue; }
				
				for(int snd = fst; snd >= 2; snd--){
					if(!is_prime[snd]){ continue; }
					else if(fst + snd > T){ continue; }
					
					final int thd = T - (fst + snd);
					if(!is_prime[thd]){ continue; }
					else if(thd > snd){ continue; }
					else if(fst >= snd + thd) { continue; }
					
					//System.out.println(fst + " " + snd + " " + thd);
					
					count++;
				}
			}
			
			System.out.println(count);
			
		}

	}
}