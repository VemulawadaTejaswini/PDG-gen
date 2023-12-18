import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] L = new int[n+1];
		int step = 0;
		int pos = 0;
		
		for (int i = 0; i < n; i++) {
			L[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (pos > x) {
				break;
			}
			pos += L[i];
			step++;
		}
		
		System.out.println(step);
	}
}