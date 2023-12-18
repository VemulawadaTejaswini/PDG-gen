import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int K;
	static int[] P;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = Integer.parseInt(sc.next());
		K = Integer.parseInt(sc.next());

		P = new int[N];
		for(int i = 0;i <= N - 1;i++) {
			P[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		boolean[] isUp = new boolean[N];
		Arrays.fill(isUp, true);
		int nextFill = 0;
		for(int i = 0;i <= N - K;i++) {
			if(P[i] > P[i + 1]) {
				for(int j = Math.max(nextFill, i - K + 2);j <= i;j++) {
					isUp[j] = false;
				}
				nextFill = i + 1;
			}
		}


		int count = 1;
		boolean isUpFlag = isUp[0];

		int Max = myMaxMin(0, K - 1, true);
		int Min = myMaxMin(0, K - 1, false);

		for(int first = 1;first <= N - K;first++) {

			int last = first + K - 1;

//			for(int i = first;i <= last;i++) {
//				System.out.print(P[i] + ",");
//			}
//			System.out.println();

			if(isUp[first]) {
				if(isUpFlag) {
//					System.out.println("a");
				} else {
					count++;
					isUpFlag = true;
				}


			}else if(P[last] > Max && P[first - 1] == Min) {
//				System.out.println("b");
			}else {
				count++;
			}

			if(P[last] > Max) {
				Max = P[last];
			}
			if(P[last] < Min) {
				Min = P[last];
			}
			if(P[first - 1] == Max) {
				Max = myMaxMin(first, last, true);
			}
			if(P[first - 1] == Min) {
				Min = myMaxMin(first, last, false);
			}
		}

		System.out.println(count);

	}

	static int myMaxMin(int f, int l, boolean b) {
		int M = P[f];
		if(b) {
			for(int i = f + 1;i <= l;i++) {
				if(M < P[i]) M = P[i];
			}
		}else {
			for(int i = f + 1;i <= l;i++) {
				if(M > P[i]) M = P[i];
			}
		}
		return M;
	}
}