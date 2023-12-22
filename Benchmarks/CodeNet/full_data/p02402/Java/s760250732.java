import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		final long n = sc.nextLong();
		
		long min = Integer.MAX_VALUE;
		long max = Integer.MIN_VALUE;
		long sum = 0;
		for(int i = 0; i < n; i++){
			final int input = sc.nextInt();
			
			min = Math.min(min, input);
			max = Math.max(max, input);
			sum += input;
		}
		
		System.out.println(min + " " + max + " " + sum);
	}

}