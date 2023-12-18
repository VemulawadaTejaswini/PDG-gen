import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A = 0, B = 0, C = 0, K = 0;
		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);
		A = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		C = Integer.parseInt(sc.next());
		K = Integer.parseInt(sc.next());
		if (K - A >= 0) {
			a = A;
			K = K - A;
		} else {
			a = K;
			K = 0;
		}
		if (K - B >= 0) {
			b = B;
			K = K - B;
		} else {
			b = K;
			K = 0;
		}
		if (K - C >= 0) {
			c = C;
			K = K - C;
		} else {
			c = K;
			K = 0;
		}
		System.out.println(a + c * (-1));
	}

}
