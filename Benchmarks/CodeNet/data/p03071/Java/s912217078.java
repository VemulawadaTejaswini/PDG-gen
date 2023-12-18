import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int max = 0;
		int cnt = 0;
		for (int i = 0; i <= 1; i++) {
			if (A >= B) {
				max = A;
				A -= 1;
			} else {
				max = B;
				B -= 1;
			}
			cnt += max;
		}
		System.out.println(cnt);
	}
}
