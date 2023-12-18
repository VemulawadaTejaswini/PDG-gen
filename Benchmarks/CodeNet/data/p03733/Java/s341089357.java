import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			sum += Math.min(s, t);
		}

		System.out.println(sum + t);
	}
}