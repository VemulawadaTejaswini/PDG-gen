

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		long K = Long.parseLong(lines[2]);
		long[] A = new long[N];
		long[] B = new long[M];

		line = sc.nextLine();
		lines = line.split(" ");
		for(int i = 0; i < N; i++) {
			A[i] = Long.parseLong(lines[i]);
//			System.out.println(A[i]);
		}

		line = sc.nextLine();
		lines = line.split(" ");
		for(int i = 0; i < M; i++) {
			B[i] = Long.parseLong(lines[i]);
//			System.out.println(B[i]);
		}

		long count = 0;
		int a = 0;
		int b = 0;
		while(K >= 0) {
			count++;
			if(a >= A.length && b >= B.length) {
				break;
			}else if(a >= A.length) {
				K = K - B[b];
				b++;
			}else if(b >= B.length) {
				K = K - A[a];
				a++;
			}else {
				if(A[a] <= B[b]) {
					K = K - A[a];
					a++;
				}else{
					K = K - B[b];
					b++;
				}
			}
		}

		System.out.println(count-1);
	}
}
