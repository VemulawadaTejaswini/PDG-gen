import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		if(M == 0) {
			System.out.println("Yes");
			return;
		}

		long[] linear = new long[100000000];

		while(M --> 0) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			int D = sc.nextInt();

			int idxL = findPerson(linear, L);
			if(idxL < 0) {
				linear[0] = L;
			}

			int idxR = findPerson(linear, R);
			if(idxR < 0) {
				linear[idxL + D] = R;
			} else {
				if(idxR - idxL != D) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
	static int findPerson(long[] linear, int person) {
		for(int i = 0; i < linear.length; i++) {
			if(linear[i] == person) return i;
		}
		return -1;
	}
}