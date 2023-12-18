import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = 3;
		int[] a = new int[N];
		Arrays.setAll(a, i -> sc.nextInt());
		
		int sum = Arrays.stream(a).sum();
		String ans = sum >= 22 ? "bust" : "win";
		System.out.println(ans);
		sc.close();
	}
}
