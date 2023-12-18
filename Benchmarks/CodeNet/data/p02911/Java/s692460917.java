import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();

		int [] seikai = new int [N];

		for (int index=0; index<Q; index++) {
			seikai[sc.nextInt()-1]++;
		}

		for (int index=0; index<N; index++) {
			if (K-(Q-seikai[index])>0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}