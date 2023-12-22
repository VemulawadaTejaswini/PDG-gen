import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = scn.nextInt();
		}
		for (int a : data) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int j = 1; j < N ; j++) {
			int v = data[j];
			int w = j - 1;
			while ( w >= 0 && data[w] > v ) {
				data[w + 1] = data[w];
				w--;
			}
			data[w + 1] = v;
			for (int a : data) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}
}

