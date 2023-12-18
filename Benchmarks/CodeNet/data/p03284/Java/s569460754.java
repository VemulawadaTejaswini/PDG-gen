import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		if(N % K == 0) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
	}
}
