import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if(M <= N * 2) {
			System.out.println(N);
		} else {
			M -= N * 2;
			System.out.println(N + (M / 4));
		}
	}
}
