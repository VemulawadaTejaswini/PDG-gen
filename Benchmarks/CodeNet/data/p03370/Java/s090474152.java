import java.util.Scanner;

public class Main {
	
	public static void main(String... ac) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), x = sc.nextInt();
		
		int sum = 0, min = (int) 2e9;
		
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			sum += m;
			min = Math.min(min, m);
		}
		
		System.out.println(n + (x - sum) / min);
		
	}
	
}