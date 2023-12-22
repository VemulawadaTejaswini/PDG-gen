import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){
			char board[][] = new char[8][8];
			int ni=0, nj=0;
			for(int k=0; k<8; k++){
				board[k] = scan.nextLine().toCharArray();
			}

			SEARCH:
			for(int i=0; i<=8; i++){
				for(int j=0; j<=8; j++){
					if(board[i][j] == '1'){
						ni=i; nj=j;
						break SEARCH;
					}
				}
			}
			judgeA(board, ni, nj);
			judgeB(board, ni, nj);
			judgeC(board, ni, nj);
			judgeD(board, ni, nj);
			judgeE(board, ni, nj);
			judgeF(board, ni, nj);
			judgeG(board, ni, nj);
		}
	}

	static void judgeA(char b[][],int k, int l){
		try{
			if(b[k+1][l+1] == '1' && b[k+1][l] == '1'){
				System.out.println("A");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error");
			return;
		}
	}

	static void judgeB(char b[][],int k, int l){
		try{
			if(b[k+3][l] == '1'){
				System.out.println("B");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeC(char b[][],int k, int l){
		try{
			if(b[k][l+3] == '1'){
				System.out.println("C");
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			return;
		}
	}

	static void judgeD(char b[][],int k, int l){
		try{
			if(b[k+2][l-1] == '1'){
				System.out.println("D");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeE(char b[][],int k, int l){
		try{
			if(b[k+1][l+2] == '1'){
				System.out.println("E");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeF(char b[][],int k, int l){
		try{
			if(b[k+2][l+1] == '1'){
				System.out.println("F");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

	static void judgeG(char b[][],int k, int l){
		try{
			if(b[k+1][l-1] == '1' && b[k][l+1] == '1'){
				System.out.println("G");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			return;
		}
	}

}