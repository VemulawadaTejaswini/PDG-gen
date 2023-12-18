import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
//		long start = System.currentTimeMillis();
		x--;
		y--;
		
		int[] k = new int[n];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int dist = Math.min(Math.abs(j - i), Math.abs(x - i) + Math.abs(y - j) + 1);
				k[dist]++;
			}
		}
		
		for (int i = 1; i < n; i++) {
			System.out.println(k[i]);
		}
		
		sc.close();
//		long end = System.currentTimeMillis();
//		System.out.printf("%05d", end - start);
	}
}
