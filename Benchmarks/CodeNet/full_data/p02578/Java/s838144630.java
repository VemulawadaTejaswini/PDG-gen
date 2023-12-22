import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		
		int stool = 0;
		for (int i = 1; i < n; i++) {
			if (a[i - 1] > a [i]) {
				int inc = a[i-1] - a[i];
				a[i] += inc;
				stool += inc;
			}
		}
		
		System.out.println(stool);
		
		in.close();
	}
}
