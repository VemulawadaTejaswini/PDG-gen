import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		
		long stool = 0;
		int max = a[0];
		for (int i = 0; i < n; i++) {
			max = Math.max(a[i], max);
			stool += max - a[i];
		}
		
		System.out.println(stool);
		
		in.close();
	}
}
