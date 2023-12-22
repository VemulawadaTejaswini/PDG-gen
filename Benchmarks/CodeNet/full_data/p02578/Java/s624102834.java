import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long sumStep = 0;
		int maxA = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			maxA = Math.max(maxA, a);
			sumStep += maxA - a;
		}
		
		System.out.println(sumStep);
		
		sc.close();
	}
}


