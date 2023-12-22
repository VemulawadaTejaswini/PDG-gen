import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int min = A;
		int max = A;
		int sum = A;		
		for(int i = 0; i < N-1; i++) {
			A = sc.nextInt();
			if (A < min)	min = A;
			else if (A > max)	max = A;
			sum = sum + A;
		}
		System.out.printf("%d %d %d\n", min, max, sum);
	}
}
