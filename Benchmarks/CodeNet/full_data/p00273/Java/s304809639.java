import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		for(int n = 0; n < N; n++){
			final int x = sc.nextInt();
			final int y = sc.nextInt();
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			
			final int n_cost = x * a + y * b;
			
			final int max_a = Math.max(5, a);
			final int max_b = Math.max(2, b);
			
			final int p_cost = (x * max_a + y * max_b) * 4 / 5;
			
			System.out.println(Math.min(n_cost, p_cost));
			
		}
	}

}