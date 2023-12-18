import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][2];
		for(int i = 0; i < N; i++) {
			a[i][0] = i;
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, (x, y) -> x[1] - y[1]);
		System.out.println(2 * N - 1);
		if(Math.abs(a[0][1]) > a[N-1][1]) {
			for(int i = 0; i < N; i++)
				System.out.println((a[0][0]+1) + " " + (i + 1));
			for(int i = N-1; i > 0; i--)
				System.out.println((i+1) + " " + i);
		}
		else {
			for(int i = 0; i < N; i++)
				System.out.println((a[N-1][0]+1) + " " + (i + 1));
			for(int i = 1; i <= N-1; i++)
				System.out.println(i + " " + (i+1));
		}
	}

}