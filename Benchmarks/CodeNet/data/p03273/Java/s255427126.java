import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String buff= "";
		int count=0;

		int[][] array = new int[h][w];

		for(int i=0;i<h;i++) {
			buff=sc.next();
			for(int j=0;j<w;j++) {
				if(buff.substring(j,j+1).equals("#")) {
					array[i][j]=1;
				}else {
					array[i][j]=0;
				}
			}
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				count+=array[i][j];
			}
			if(count==0) {
				for(int k=i;k<h-1;k++) {
					for(int l=0;l<w;l++) {
						array[k][l]=array[k+1][l];
					}
				}
				h--;
				i--;
			}
			count=0;
		}
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				count+=array[j][i];
			}
			if(count==0) {
				for(int k=i;k<w-1;k++) {
					for(int l=0;l<h;l++) {
						array[l][k]=array[l][k+1];
					}
				}
				w--;
				i--;
			}
			count=0;
		}

		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(array[i][j]==1) {
					System.out.print("#");
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}


