import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int[] dislike = new int[K];
		boolean[] H = new boolean[10];
		for(int i = 0; i < dislike.length; i++) {
			dislike[i] = Integer.parseInt(sc.next());
			H[dislike[i]] = true;
		}

		for(; N < 10000; N++) {
			if(check(N, H)) {
				System.out.println(N);
				break;
			}
		}
	}

	static boolean check(int N, boolean[] H) {
		while(N >= 1) {
			if(H[N % 10]) return false;
			N /= 10;
		}
		return true;
	}
}