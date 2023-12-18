import java.util.Scanner;

//AtCoder Beginner Contest 155
//B	Papers, Please
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(sc.next());

		}
		sc.close();

		String ans = "APPROVED";
		for (int i = 0; i < N; i++) {
			if (A[i] % 2 == 0) {
				if (A[i] % 3 != 0 && A[i] % 5 != 0) {
					ans = "DENIED";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
