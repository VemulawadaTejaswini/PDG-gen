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
		int[] primes = new int[MAX];
		int prime_count = 0;
		Arrays.fill(is_prime, 2, MAX + 1, true);
		for(int i = 2; i <= MAX; i++){
			if(is_prime[i]){
				primes[prime_count] = i;
				prime_count++;
				
				for(int j = i * 2; j <= MAX; j += i){
					is_prime[j] = false;
				}			
			}
		}
		
		
		while (true) {
			final int T = sc.nextInt();
			
			if(T == 0){ break; }
			
			long count = 0;
			
			for(int fst = 0; fst < prime_count; fst++){
				final int fst_num = primes[fst];
				if(fst_num > T){ break; }
				
				for(int snd = fst; snd < prime_count; snd++){
					final int snd_num = primes[snd];
					if(fst_num + snd_num > T){ break; }
					
					final int thd_num = T - (fst_num + snd_num);
					
					if(snd_num > thd_num){ break; }
					if(fst_num + snd_num + thd_num > T){ break; }
					else if(thd_num >= snd_num + fst_num){ continue; }
					else if(!is_prime[thd_num]){ continue; }	
					
					//System.out.println(fst_num + " " + snd_num + " " + thd_num);
					
					count++;
				}
			}
			
			System.out.println(count);
		}

	}
}