import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		Arrays.setAll(d, i -> sc.nextInt());
		
		int sum = 0;
		for (int x = 0; x < n - 1; x++) {
			for (int y = x + 1; y < n; y++) {
				sum += d[x] * d[y];
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
	
}


