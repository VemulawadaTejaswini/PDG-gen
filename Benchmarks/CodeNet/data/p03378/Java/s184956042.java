import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		
		int A = 0;
		int cost1 = 0;
		int cost2 = 0;
		
		for(int i = 1; i < M + 1; i++) {
			A = sc.nextInt();
			if(A < X) {
				cost1++;
			} else {
				cost2++;
			}
		}
		
		System.out.println(Math.min(cost1, cost2));
		
	}
}
