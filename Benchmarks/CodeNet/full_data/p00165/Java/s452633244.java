import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] is_prime = new boolean[1000001];
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		
		ArrayList<Integer> prime_list = new ArrayList<Integer>();
		
		for(int i = 2; i <= 1000; i++){
			if(is_prime[i]){
				for(int j = 2 * i; j <= 1000000; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		for(int i = 0; i <= 1000000; i++){
			if(is_prime[i]){
				prime_list.add(i);
			}
		}
		
		//System.out.println(prime_list);
		
		while(true){
			final int n = sc.nextInt();
			
			
			if(n == 0){
				break;
			}
			
			int sum = 0;
			
			for(int i = 0; i < n; i++){
				final int p = sc.nextInt();
				final int m = sc.nextInt();
				
				int pre = Collections.binarySearch(prime_list, p - m);
				if(pre < 0){
					pre = -(pre + 1);
				}
				
				int post = Collections.binarySearch(prime_list, p + m);
				if(post < 0){
					post = (-(post + 1) - 1);
				}
				
				//if(pre > post){
				//	post = pre;
				//}
				
				if(pre > post){
					sum -= 1;
				}else if(pre < post){
					sum += post - pre;
				}else{
					sum += 0;
				}
				
				//System.out.println(pre + " " + post + " " + sum);
			}
			
			System.out.println(sum);
		}
		
	}

}