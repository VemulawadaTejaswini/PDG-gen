import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int T = N * (N - 1) + M * (M - 1);
		System.out.println(T / 2);		
	}
}
