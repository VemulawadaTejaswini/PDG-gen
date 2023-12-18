
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] NM = new int[2][1];
		for(int j = 0; j < 2; j++) {
			NM[j][0] = sc.nextInt();
		}

		int N = NM[0][0];
		int M = NM[1][0];

		int[][] SM = new int[M][2];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < 2; j++) {
				SM[i][j] = sc.nextInt();
			}

		}

		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;

		int count_1 = 0;
		int count_2 = 0;
		int count_3 = 0;


		for(int i = 0; i < M; i++) {
			if(SM[i][0] == 1) {
				if((count_1 > 0) && (A == SM[i][1])) {
					continue;
				}
				A = SM[i][1];
				count_1++;
			}else if(SM[i][0] == 2) {
				if((count_2 > 0) && (B == SM[i][1])) {
					continue;
				}
				B = SM[i][1];
				count_2++;
			}else {
				if((count_3 > 0) && (C == SM[i][1])) {
					continue;
				}
				C = SM[i][1];
				count_3++;
			}
			if((count_1 > 1) || (count_2 > 1) || (count_3 > 1)) {
				D = -1;
				break;
			}
		}
		if(D == 0){
			if(N == 3) {
				if(A == 0) {
					D = -1;
				}else {
					if(B == 0) {
						D = -1;
					}else {
						if(C == 0) {
							D = 0;
						}else {
							D = A * 100 + B * 10 + C;
						}
					}

				}
			}else if(N == 2) {
				if(A == 0) {
					D = -1;
				}else {
					D = A * 10 + B;
				}
			}else {
				D = A;
			}
		}
		if(M == 0) {
			D = 0;
		}
		System.out.println(D);

		sc.close();
	}
}
