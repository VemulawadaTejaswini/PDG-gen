import java.util.*;
public class Main {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0, sum = 0;
		for (int i = 0; i < N; i++) {
			int c = sc.nextInt();
			max = Math.max(max, c);
			sum += c;
		}
		System.out.println(sum - max / 2);
	}
}
