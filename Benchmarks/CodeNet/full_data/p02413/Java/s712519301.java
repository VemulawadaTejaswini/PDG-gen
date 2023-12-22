import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] array = new int[r+1][c+1];

		for(int i=0; i<r; i++) {
			int csum=0;
			for(int j=0; j<c; j++) {
				array[i][j]=sc.nextInt();
				csum +=array[i][j];
			}
			array[i][c]=csum;
		}
		int sum=0;
		for(int i=0; i<c;i++) {
			int rsum=0;
			for(int j=0; j<r; j++) {
				rsum+=array[j][i];
			}
			array[r][i]=rsum;
			sum+=rsum;
		}
		array[r][c]=sum;

		for(int i=0; i<r+1; i++) {
			for(int j=0; j<c+1; j++) {
				if(j==0) {
					System.out.printf("%d",array[i][j]);
				}else {
					System.out.printf(" %d",array[i][j]);
				}

			}
				System.out.println();
		}

	}
}
