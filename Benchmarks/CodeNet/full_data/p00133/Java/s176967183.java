//Volume1-0133
import java.util.Scanner;

class Main {

	private static final int      L      = 8;
	private static       char[][] board,
	                              temp;

	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		board = new char[L][L];
		temp  = new char[L][L];
		for(int i=0;i<L;i++){
			board[i] = sc.nextLine().toCharArray();
		}
		for(int i=0;i<3;i++){
			turn();
			print(i);
		}
	}

	private static void turn(){
		copy(board,temp);
		for(int i=0;i<L;i++){
			for(int j=0;j<L;j++){
				board[j][L-1-i] = temp[i][j];
			}
		}
	}

	private static void copy(char[][] a,char[][] b){
		for(int i=0;i<L;i++){
			for(int j=0;j<L;j++){
				b[i][j] = a[i][j];
			}
		}
	}

	private static void print(int angle){
		System.out.println((angle+1)*90);
		for(int i=0;i<L;i++){
			for(int j=0;j<L;j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

	}
}