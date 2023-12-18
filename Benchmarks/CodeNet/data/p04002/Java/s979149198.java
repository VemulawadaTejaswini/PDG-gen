import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		int[][] board = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				board[i][j] = 0;
			}
		}
		int n = scanner.nextInt();

		for(int i=0;i<n;i++){
			int a = scanner.nextInt()-1;
			int b = scanner.nextInt()-1;
			board[a][b] = 1;
		}
		scanner.close();
		int count;
		long[] jcount = new long[10];
		for(int i=0;i<10;i++){
			jcount[i] = 0;
		}
		for(int i=0;i<h-2;i++){
			for(int j=0;j<w-2;j++){
				count = 0;
				for(int k=i;k<i+3;k++){
					for(int l=j;l<j+3;l++){
						if(board[k][l]==1){
							count++;
						}
					}
				}
				jcount[count]++;
			}
		}
		for(int i=0;i<10;i++){
			System.out.println(jcount[i]);
		}
	}
}
