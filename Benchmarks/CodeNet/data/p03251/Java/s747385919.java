import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int maxX = x;
		int minY = y;
		
		for (int i = 0; i < n; i++) {
			maxX = Math.max(maxX, sc.nextInt());
		}
		
		for (int i = 0; i < m; i++) {
			minY = Math.min(minY, sc.nextInt());
		}
		
		String ans = maxX < minY ? "No War" : "War";
		System.out.println(ans);
		sc.close();
	}
}


