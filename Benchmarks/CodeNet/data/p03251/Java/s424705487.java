import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int[]x = new int[N];
		int[]y = new int[M];
		for(int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
		}
		for(int i = 0; i < M; i++) {
			y[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(x);
		Arrays.sort(y);
		if(x[N - 1] < y[0]) {
			int k = y[0];
			if(k > X && k <= Y) {
				System.out.println("No War");
			}else {
				System.out.println("War");
			}
		}else {
			System.out.println("War");
		}
	}
}
