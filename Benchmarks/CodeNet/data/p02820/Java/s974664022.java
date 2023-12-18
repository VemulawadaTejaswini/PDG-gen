import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();
		int A[] = new int[T.length()];
		long sum = 0;
		for (int i = 0; i < T.length(); i++) {
			if (A[i] != 1) {
				switch (T.charAt(i)) {
				case 'r':
					sum += P;
					break;
				case 's':
					sum += R;
					break;
				default:
					sum += S;
					break;
				}
				if (i+K<T.length()&&T.charAt(i)==T.charAt(i+K)) {
					A[i+K] =1;
				}
			}
		}
		System.out.println(sum);
	}

}