import java.util.Scanner;
import java.util.Arrays;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] input = new int[n];
		for(int i=0; i<n; i++) {
			input[i] = sc.nextInt();
		}
		Arrays.sort(input);
		int max = 0;
		for(int i=n-1; i>n-k-1; i--) {
			max += input[i];
		}
		System.out.println(max);;
	}
}