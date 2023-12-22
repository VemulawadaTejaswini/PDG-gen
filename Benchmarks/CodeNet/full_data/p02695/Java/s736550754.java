import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();
			int M = scn.nextInt();
			int Q = scn.nextInt();

			int[] a = new int[Q];
			int[] b = new int[Q];
			int[] c = new int[Q];
			int[] d = new int[Q];
			int[] x = new int[N];

			for(int i = 0; i < Q; i++) {
				a[i] = scn.nextInt();
				b[i] = scn.nextInt();
				c[i] = scn.nextInt();
				d[i] = scn.nextInt();
			}

			//初期化
			for(int i = 0; i < N; i++) {
				x[i] = M;
			}
			int sum = 0;
			int result = 0;
			//N × M回処理する
			//1 <= A1 <= A2 <= A3...<= AN <=M の条件を守る
			//
			for(int i = 0; i < N; i++) {
				//初期化
//				for(int j = 0; j < N; j++) {
//					x[j] = M;
//				}
				for(int j = 0; j < M-1; j++) {
					x[i] = x[i] - 1;
//					x = check(x, i);
					//計算処理
					for(int k = 0; k < Q; k++) {
						if(x[b[k]-1] - x[a[k]-1] == c[k]) {
							sum = sum + d[k];
						}
					}
					if(result < sum) {
						result = sum;
					}
					sum = 0;

				}
			}
			System.out.println(result);
		}
	}

	public static int[] check(int[] num, int i) {
		if(i == 0) return num;
		if(num[i-1] > num[i]) {
			num[i-1] = num[i-1] - 1;
			check(num, i - 1);
		}
		return num;
	}
}