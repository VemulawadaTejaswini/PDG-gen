import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 1;
		int max = 0;
		int sum = 0;		
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if (A < min)
				min = A;
			if (A > max)
				max = A;
			sum = sum + A;
		}
		System.out.printf("%d %d %d\n", min, max, sum);
	}
}

