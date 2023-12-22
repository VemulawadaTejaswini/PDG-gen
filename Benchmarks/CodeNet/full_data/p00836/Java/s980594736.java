import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		boolean[] is_prime = new boolean[10001];
		
		for(int i = 2; i <= 10000; i++){
			is_prime[i] = true;
		}
		
		for(int i = 2; i <= 100; i++){
			if(is_prime[i]){
				for(int j = i * 2; j <= 10000; j += i){
					is_prime[j] = false;
				}
			}
		}
		
		ArrayList<Integer> p_list = new ArrayList<Integer>(); 
		for(int i = 2; i <= 10000; i++){
			if(is_prime[i]){
				p_list.add(i);
			}
		}
		
		int[] count = new int[10001];
		final int size = p_list.size();
		
		for(int len = 1; len <= size; len++){
			int sum = 0;
			for(int i = 0; i < len; i++){
				sum += p_list.get(i);
			}
			
			if(sum > 10000){
				break;
			}
			count[sum]++;
			
			for(int i = len; i < size; i++){
				sum += p_list.get(i);
				sum -= p_list.get(i - len);
				if(sum > 10000){
					break;
				}
				
				count[sum]++;
			}
		}
		
		/*
		for(int i = 0; i < 21; i++){
			System.out.println(i + " : " + dp[i] + " , ");
		}
		System.out.println();
		*/
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(count[n]);
		}
	}

}