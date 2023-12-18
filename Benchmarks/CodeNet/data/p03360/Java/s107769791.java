import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		int maxab = Math.max(a, b);
		int max = Math.max(c, maxab);
		
		int max2 = max;
		
		for (int i = 0; i < k; i++){
			max2 *= 2;
		}
		
		System.out.println(max2 + a + b + c - max);
	}
}