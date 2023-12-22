import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][][] residents = new int[4][3][10];
		int n, b, f, r, v;
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			b = sc.nextInt() - 1;
			f = sc.nextInt() - 1;
			r = sc.nextInt() - 1;
			v = sc.nextInt();
			residents[b][f][r] += v;
		}
		for (int i = 0; i < residents.length; i++) {
			for (int j = 0; j < residents[i].length; j++) {
				for (int k = 0; k < residents[i][j].length; k++) {
					System.out.print(" " + residents[i][j][k]);
				}
				System.out.println();
			}
			if (i != residents.length - 1) {
				System.out.println("####################");
			}
		}
		sc.close();
	}
}
