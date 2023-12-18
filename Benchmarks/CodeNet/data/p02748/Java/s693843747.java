import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[A];
		int[] b = new int[B];
		int[][] xyc = new int[A][B];
		int minA = Integer.MAX_VALUE;
		for(int i = 0; i < A; i++) {
			a[i] = sc.nextInt();
			if(minA > a[i]) minA = a[i];
		}
		int minB = Integer.MAX_VALUE;
		for(int i = 0; i < B; i++) {
			b[i] = sc.nextInt();
			if(minB > b[i]) minB = b[i];
		}
		int min = minA + minB;
		for(int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			int m = a[x -1] + b[y - 1] - c;
			if(min > m) min = m;
		}
		sc.close();
		System.out.println(min);
	}
}
