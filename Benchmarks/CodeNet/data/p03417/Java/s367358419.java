import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int count = 0;
		
		if(N == 1 && M == 1) {
			count = 1;
		} else if(N == 1 && M > 1) {
			count = M - 2;
		} else if(N > 1 && M == 1) {
			count = N - 2;
		} else {
			count = N * M - (2 * N + 2 * M - 4);
		}
		System.out.println(count);
	}
}
