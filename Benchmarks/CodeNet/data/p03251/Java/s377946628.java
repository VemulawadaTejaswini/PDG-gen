import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[M];
		for (int i=0;i<N;i++) {
			x[i] = sc.nextInt();
		}
		for (int i=0;i<M;i++) {
			y[i] = sc.nextInt();
		}
		Arrays.parallelSort(x);
		Arrays.parallelSort(y);
		for (int i=X;i<=Y;i++) {
			if (x[N-1]<i&&y[0]>=Y) {
				System.out.println("No War");
				return ;
			}
		}
		System.out.println("War");
	}
}