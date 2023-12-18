import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int matrix[][] = new int[H][W];
		for(int i = 0; i<matrix.length;i++) {
			for(int j = 0; j<matrix[i].length;j++) {
				matrix[i][j] = 0;
			}
		}
		int putAcount;
		int countB;
		int Noflag = 0;
		if(B==0) {
			if(H!=1) {
				Noflag=1;
			}else {
				B = B + 1;
			}
		}
		if(Noflag==0) {
			for(int i = 0; i<matrix.length;i++) {
				putAcount = 0;
				for(int j = 0; j<matrix[i].length;j++) {
					countB = 0;
					if((putAcount<A)) {
						for(int k = 0; k<matrix.length;k++) {
							if(matrix[k][j] == 1) {
								countB++;
							}
						}
						if(countB<B) {
							matrix[i][j] = 1;
							putAcount++;
						}
					}
					if(j == (matrix[i].length-1)) {
						if(putAcount!=A) {
							Noflag=1;
						}
					}
				}
				if(Noflag==1) {
					break;
				}
			}
		}

		if(Noflag==0) {
			for(int i = 0; i<matrix.length;i++) {
				for(int j = 0; j<matrix[i].length;j++) {
					System.out.print(matrix[i][j]);
				}
				System.out.println();
			}
		}else {
			System.out.println("No");
		}
	}

}
