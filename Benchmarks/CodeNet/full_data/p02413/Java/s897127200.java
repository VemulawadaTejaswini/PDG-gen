import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int[][] sheet = new int[x+1][y+1];
		int[] row = new int[x];
		int[] col = new int[y];
		int total = 0;

		for(int i=0;i<x+1;i++) {
			for(int j=0;j<y+1;j++) {
				if(i!=x && j!=y){
					sheet[i][j] = sc.nextInt();
					total += sheet[i][j];
					row[i] += sheet[i][j];
					col[j] += sheet[i][j];
				}else if(i!=x && j==y) {
					sheet[i][j] = row[i];
				}else if(i==x && j!=y) {
					sheet[i][j] = col[j];
				}else if(i==x && j==y) {
					sheet[i][j] = total;
				}
			}
		}

		for(int i=0;i<x+1;i++) {
			for(int j=0;j<y+1;j++) {
				System.out.print(sheet[i][j]);
				if(j!=y) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
