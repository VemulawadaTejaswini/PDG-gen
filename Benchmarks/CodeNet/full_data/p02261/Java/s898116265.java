import java.util.Scanner;

public class Main {
	static int N = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.nextLine());

		// int[] A = Arrays.stream(sc.nextLine().split("
		// ")).mapToInt(Integer::parseInt).toArray();

		String[] S = sc.nextLine().split(" ");
		String[] A = new String[N];
		String[] B = new String[N];
		System.arraycopy(S, 0, A, 0, S.length);
		System.arraycopy(S, 0, B, 0, S.length);

		String tmpA = "";
		String tmpB = "";

		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j > i; j--) {
				char[] preBox = A[j - 1].toCharArray();
				char[] aftBox = A[j].toCharArray();
				if (preBox[1] > aftBox[1]) {
					tmpA = A[j];
					A[j] = A[j - 1];
					A[j - 1] = tmpA;
				}
			}
		}

		out_put(A);

		System.out.println("Stable");

		int minl;
		for (int k = 0; k < N; k++) {
			minl = k;
			for (int l = k; l < N; l++) {
				char[] minBox = B[minl].toCharArray();
				char[] lBox = B[l].toCharArray();
				if (lBox[1] < minBox[1])
					minl = l;
			}
			if (k != minl) {
				tmpB = B[minl];
				B[minl] = B[k];
				B[k] = tmpB;
			}
		}

		out_put(B);

		if (isStable(A, B)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

		sc.close();
	}

	private static void out_put(String array[]) {

		System.out.printf("%s", array[0]);

		for (int i = 1; i < array.length; i++) {
			System.out.printf(" %s", array[i]);
		}
		System.out.printf("\n");
	}

	private static boolean isStable(String in[], String out[]) {
		// for (int i = 0; i < N; i++)
		// for (int j = i + 1; j < N; j++)
		// for (int a = 0; a < N; a++)
		// for (int b = a + 1; b < N; b++) {
		// char[] iBox = in[i].toCharArray();
		// char[] jBox = in[j].toCharArray();
		// if ((iBox[1] == jBox[1]) && (in[i].equals(out[b])) && (in[j].equals(out[a])))
		// return false;
		// }
		
		for (int i = 0; i < N; i++)
			if (!in[i].equals(out[i]))
				return false;
		return true;
	}
}

