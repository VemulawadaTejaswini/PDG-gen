import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		int m = n+1; int count = 0;
		for (int i = 0; i < n; i++) {
			if(m >= p[i]) {
				count++;
				m = p[i];
			}
		}
		System.out.println(count);
		sc.close();
	}
}