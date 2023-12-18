import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] b = new int[N][2];
		for (int i=0;i<N;i++) {
			b[i][0]=sc.nextInt();
		}

		for (int i=0;i<N;i++) {
			if (b[i][0]>i+1) {
				System.out.println(-1);
				break;
			}
			b[i][1]=b[i][0];
			for (int j=0;j<i;j++) {
				if (b[j][1]>=b[i][0]) {
					b[j][1]++;
				}
			}
			if (i==N-1) {
				Arrays.sort(b, (A, B) -> Long.compare(A[1], B[1]));
				for (int k=0;k<N;k++) {
					System.out.println(b[k][0]);
				}
			}
		}
	}
}