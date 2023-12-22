import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ai = new int[n];
		int max = -1000000;
		int min = 1000000;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			ai[i] = scan.nextInt();
			max = Math.max(max, ai[i]);
			min = Math.min(min, ai[i]);
			sum += ai[i];
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
	}
}
