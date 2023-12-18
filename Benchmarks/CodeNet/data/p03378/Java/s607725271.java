import java.util.Scanner;

public class Main {
	
	public static void main(String... ac) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
		
		int cnt = 0;
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			if (a < x) cnt++;
		}
		
		System.out.println(Math.min(cnt, m - cnt));
		
	}
	
}