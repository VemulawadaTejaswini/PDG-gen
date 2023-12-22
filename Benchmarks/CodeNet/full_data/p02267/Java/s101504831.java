import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int[] S = new int[100001];
		for (int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}

		int q, key = 0;
//		Scanner sc1 = new Scanner(System.in);
		q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			key = sc.nextInt();
			if (linearSearch(S, n, key))
				sum++;
		}
		System.out.println(sum);
	}

	private static boolean linearSearch(int[] S, int n, int key) {
		int i = 0;
		boolean boo = false;
		S[n] = key;
		while (S[i] != key)
			i++;
		if (i != n)
			boo = true;
		return boo;
	}

}

