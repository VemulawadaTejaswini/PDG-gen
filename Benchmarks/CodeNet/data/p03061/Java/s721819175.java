import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		for(int i = 0; i < N ; i++) {
			A[i] = sc.nextInt();
		}

		A[0] = A[1];

		sc.close();

		int answer = A[0];

		for(int i = 1 ; i < N ;i ++) {
			answer = gcd(answer, A[i]);
		}

		System.out.println(answer);
	}

	public static int gcd(int a, int b) {
		int tmp;
		if(b > a) {
			tmp = a;
			a = b;
			b = tmp;
		}

		if(a % b ==0) {
			return b;
		} else {
			return gcd(b, a%b);
		}
	}

}
