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
		for (int i = 0; i < X+Y; i++) c[a[i][1]]++;
		
		int toReduce = (c[0] > X)?0:1;
		int dropIndex = X+Y-1;
		int addIndex = X+Y;
		while (!isEatable(c)) {
			while (a[dropIndex][1] != toReduce) dropIndex--;
			a[dropIndex][1] = -1;
			c[toReduce]--;
			while (a[addIndex][1] == toReduce) {
				a[addIndex][1] = -1;
				addIndex++;
			}
			c[a[addIndex][1]]++;
			addIndex++;
		}
		int s = 0;
		for (int i = 0; i < addIndex; i++) {
			if (a[i][1] > -1) s += a[i][0];
		}
		System.out.println(s);
	}
	
	private boolean isEatable(int[] c) {
		return (c[0] <= X && c[1] <= Y);
	}
	
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
