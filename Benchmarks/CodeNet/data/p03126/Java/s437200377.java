import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] food = new int[m];
		Arrays.fill(food, 0);
		for(int i =0; i < n; i++) {
			int k = sc.nextInt();
			for(int j =0; j < k; j++) {
				food[sc.nextInt()-1]++;
			}
		}
		long count = Arrays.stream(food).filter(i -> i == n).count();
		System.out.println(count);
	}
}