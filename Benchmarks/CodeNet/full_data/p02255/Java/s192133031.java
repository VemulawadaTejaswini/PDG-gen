import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int v = 0;
		int j = 0;
		int N[] = new int[n];
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			N[i] = x;
		}
		for (int k = 0; k < n - 1; k++) {
			System.out.print (N[k] + " ");
			}
			System.out.println (N[n - 1]);
		for (int i = 1; i < n; i++) {
			v = N[i];
			j = i - 1;
			while (j >= 0 && N[j] > v) {
				N[j + 1] = N[j];
				j--;
				}
			N[j + 1] = v;
			for (int k = 0; k < n - 1; k++) {
				System.out.print (N[k] + " ");
				}
				System.out.println (N[n - 1]);
		}
	}
}
