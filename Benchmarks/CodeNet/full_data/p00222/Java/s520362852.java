import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static int MAX = 10000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] is_prime = new boolean[MAX+1];
		Arrays.fill(is_prime, true);
		is_prime[0] = is_prime[1] = false;
		
		for(int i = 0; i <= MAX; i++){
			if(is_prime[i]){
				for(int j = i * 2; j <= MAX; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		while (true) {
			
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			for(int i = n; i >= 13; i--){
				if(is_prime[i] && is_prime[i-2] && is_prime[i-6] && is_prime[i-8]){
					System.out.println(i);
					break;
				}
			}
		}
	}

}