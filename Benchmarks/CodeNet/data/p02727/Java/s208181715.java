import java.util.*;

class Main {
	Scanner sc;
	int X, Y, A, B, C;
	int[][] a;
	
	void calc() {
		sc = new Scanner(System.in);
		X = sc.nextInt();
		Y = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		a = new int[A+B+C][2];
		for (int i = 0; i < A; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = 0;
		}
		for (int i = A; i < A+B; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = 1;
		}
		for (int i = A+B; i < A+B+C; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = 2;
		}
		Arrays.sort( a, Comparator.comparingInt( (int[] app) -> app[0] ).reversed());
		int[] c = new int[3];
		long s = 0;
		int counted = 0;
		for (int i = 0; i < A+B+C; i++) {
			if (c[0] == X && a[i][1] == 0) continue;
			if (c[1] == Y && a[i][1] == 1) continue;
			s += a[i][0];
			c[a[i][1]]++;
			counted++;
			if (counted == X+Y) break;
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
