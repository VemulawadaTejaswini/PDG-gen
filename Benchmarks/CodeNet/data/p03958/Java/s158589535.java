import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			
			final int K = sc.nextInt();
			final int T = sc.nextInt();
			
			int[] array = new int[T];
			for(int i = 0; i < T; i++){
				array[i] = -sc.nextInt();
			}
			Arrays.sort(array);
			for(int i = 0; i < T; i++){
				array[i] = -array[i];
			}
			
			if(T == 1){
				System.out.println(array[0] - 1);
			}else{
				int min = Integer.MAX_VALUE;
				for(int other = 0; other < T; other++){
					final int can_use = K - array[other];
					
					final int pairs = Math.min(can_use, array[other]);
					//System.out.println(pairs);
					
					final int other_rest = array[other] - pairs;
					final int pairs_rest = can_use - pairs;
					
					//System.out.println(other_rest + " " + pairs_rest);
					min = Math.min(min, Math.max(0, Math.max(other_rest, pairs_rest) - 1));
				}
				
				System.out.println(min);
			}
		}
	}
}