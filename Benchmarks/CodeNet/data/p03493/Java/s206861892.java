import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[210];
		int N = Integer.parseInt(sc.next());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		int result = 0;
		boolean flg = false;
		while (true) {
			for (int i = 0; i < A.length; i++) {
				if (A[i]%2 == 1) {
					flg = true;
					break;
				}
				A[i]/=2;
			}
			if (flg) {
				break;
			} else {
				result++;
			}
		}
		System.out.println(result);
	}
}