import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		while (true) {
			int n = s.nextInt();
			int p = s.nextInt();

			if (n == 0 && p == 0)
				break;

			int[] temoto = new int[n];
			int cup = p;
			int count = 0;

			for (int i = 0; temoto[i % n] != p; i = (i + 1) % n) {
				if (cup != 0) {
					cup--;
					temoto[i]++;
				} else {
					cup = temoto[i];
					temoto[i] = 0;
				}
				count++;
			}

			for (int m = 0; m < n; m++) {
				if (temoto[m] != 0)
					System.out.println(m + " " + count);
			}
		}
		s.close();
	}

	private static int countCandidates(int[] temoto) {
		int nCandidates = 0;
		for (int j = 0; j < temoto.length; j++) {
			if (temoto[j] > 0)
				nCandidates++;
		}
		return nCandidates;
	}
}