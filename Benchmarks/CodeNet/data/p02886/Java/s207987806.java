import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d[] = new int[n];
		for (int i = 0; i < n; i++)
			d[i] = scan.nextInt();

		scan.close();
		int s = 0;
		for (int a = 0; a < n; a++) {
			for (int b = a + 1; b < n; b++) {
				s = s + d[a] * d[b];
			}
		}
		System.out.print(s);
	}
}