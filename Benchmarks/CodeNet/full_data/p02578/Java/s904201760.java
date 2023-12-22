import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sumStep = 0;
		int maxA = sc.nextInt();
		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			sumStep += Math.max(0, maxA - a);
			maxA = Math.max(maxA, a);
		}
		
		System.out.println(sumStep);
		
		sc.close();
	}

}


