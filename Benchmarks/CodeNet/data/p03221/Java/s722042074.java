import java.util.Scanner;

class Main {
	static void swap(int[][] a, int b, int c){
		int t1 = a[b][0];
		int t2 = a[b][1];
		a[b][0] = a[c][0];
		a[b][1] = a[c][1];
		a[c][0] = t1;
		a[c][1] = t2;
	}

	static void leftsort(int[][] a, int left, int right){
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2][0];
		do {
			while (a[pl][0] < x)
				pl = pl + 1;
			while (a[pr][0] > x)
				pr = pr - 1;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
		if (left < pr)
			leftsort(a, left, pr);
		if (pr < right)
			leftsort(a, pl, right);
	}

	tatic void rightsort(int[][] a, int left, int right){
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2][1];
		do {
			while (a[pl][1] < x)
				pl = pl + 1;
			while (a[pr][1] > x)
				pr = pr - 1;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
		if (left < pr)
			rightsort(a, left, pr);
		if (pr < right)
			rightsort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int[][] P = new int[M][2];
		int[][] id = new int[M][12];
		for (int i = 0; i < M; i++) {
		 	P[i][0] = stdIn.nextInt();
		 	P[i][1] = stdIn.nextInt();
		 } 
		for (int i = 0; i < M; j++) {
			for (int j = 0; i < 12; i++) {
				id[j][i] = 0;	
			}
		}
		int s, t;
		for (int i = 0; i < M; i++) {
			t = P[i][0];
			for (int j = 0; j < 6; j++) {
				s = t;
				s = s % Math.pow(10, 6 - j);
				if (j == 5)
					id[i][j] = s;
				else
					id[i][j] = s / Math.pow(10, 5 - j);
			}
		}
		leftsort(P, 0, M - 1);
		int u = P[0][0];
		int v = 0;
		int[] equal = new int[M]; 
		for (int i = 0; i < M; i++) {
			equal[i] = 0;
		}
		for (int i = 0; i < M; i++) {
			if (P[i][0] > u) { 
				v = v + 1;
				equal[v] = i;
				u = P[i][0];
			}
		}
		int dif,t3, s3;
		for (int i = 0; i < M; i++) {
			int left = equal[i];
			int right = equal[i + 1];
			if (left < right) {
				rightsort(P, left, right - 1);
				dif = right - left;
				for (int j = left; j < right; j++) {
					t3 = dif;
					for (int k = 6; k < 12; k++) {
						s3 = t3;
						s3 = s3 % Math.pow(10, 12 - k);
						if (k == 11)
							id[j][k] = s3;
						else
							id[j][k] = s3 / Math.pow(10, 11 - k);
					}
				}
			}
			else
				id[i][11] = 1;
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print(id[i][j]);
			}
			System.out.println();
			
		}
	}
}