import java.util.Scanner;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		int[] powers = new int[NUM*3];
		for(int i = 0; i < NUM*3; i++){
			powers[i] = Integer.parseInt(scan.next());
		}
		
		// sort
		Arrays.sort(powers);
		
		// search
		long sum = 0;
		for(int i = NUM; i < NUM * 2; i++){
			sum += powers[i];
		}
		
		// answer
		System.out.println(sum);
		
	}
}