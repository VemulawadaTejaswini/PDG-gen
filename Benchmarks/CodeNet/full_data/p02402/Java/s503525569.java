import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int min = A;
		int max = A;
		int sum = A;
		for(int i = 1; i < N; i++) {
			A = sc.nextInt();
			if (A < min)	min = A;
			if (A > max)	max = A;
			sum = sum + A;
		}
		System.out.println(min + " " + max + " " + sum);
	}
}

