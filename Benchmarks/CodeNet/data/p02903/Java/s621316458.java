import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A= sc.nextInt();
		int B = sc.nextInt();
		int C[][] = new int[H][W];
		if (A==0) {
			for (int i=0;i<B;i++) {
				for (int j=0;j<W;j++) {
					C[i][j]=1;
				}
			}
		} else if (B==0) {
			for (int i=0;i<A;i++) {
				for (int j=0;j<H;j++) {
					C[j][i]=1;
				}
			}
		} else {
			if ((H%A!=0||W%B!=0)&&H%A!=W%B) {
				System.out.println("No");
				return ;
			}
			for (int i=0;i<H/A;i++) {
				for (int j=i;j<i+A;j++) {
					for (int k=i;k<i+B;k++) {
						C[k][j]=1;
					}
				}
			}
		}

		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				System.out.print(C[i][j]);
			}
			System.out.println();
		}
	}
}