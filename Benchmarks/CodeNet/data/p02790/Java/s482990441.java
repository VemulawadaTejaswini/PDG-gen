
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}
	
	public static String solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		if (N >= M) {
			for (int i = 0; i < N; i++) {
				sb.append(M);
			}
		}
		return sb.toString();
	}
}
