import java.util.*;

public class Main{
	public static void main( String[] args ){
		
		//Make a instance of Scanner
		Scanner scan = new Scanner(System.in);
		
		//size of matrix
		int size = 3;
		int matrix[][] = new int[size][size];
		
		// input each values in the matrix
		for(int i = 0; i < matrix.length ; i++){
			for(int j = 0 ; j < matrix[i].length ; j++ ){
				matrix[i][j] = scan.nextInt();
			}
		}
		
		// input numbers to be inspected
		int n = scan.nextInt();
		int num[] = new int[n];
		for(int i = 0; i< num.length ; i++){
			num[i] = scan.nextInt();
		}
		
		// second matrix to show if each elements in matrix[][] matchs any elements in num[]
		boolean isCoincide[][] = new boolean[size][size];
		
		// initialize all isCoincide[][] elements with 'true'
		for(int i = 0 ; i< matrix.length ; i++){
			for(int j = 0 ; j < matrix[i].length ; j++){
				for(int k = 0 ; k < num.length ; k++){
					if(matrix[i][j] == num[k]){
						isCoincide[i][j] = true;
					}
				}
			}
		}
		
		
		// isBingo[0] shows if each row is judged as bingo
		// isBingo[1] shows if each line is judged as bingo
		// isBingo[2][0] shows diagonal line (top-left to bottom-right) is judged as bingo
		// isBingo[2][1] shows diagonal line (top-right to bottom-left) is judged as bingo
		boolean isBingo[][] = new boolean[3][];
		
		// set elements by initializing isBingo[][]
		isBingo[0] = new boolean[] {true,true,true};
		isBingo[1] = new boolean[] {true,true,true};
		isBingo[2] = new boolean[] {true,true};
		
		
		// inspect all elements in isCoincide[][] and judge bingo
		for(int i = 0 ; i < matrix.length ; i++){
			for(int j = 0 ; j < matrix[i].length ; j++){
				
				// for this 'if' statement, i means line , and j means row
				if(isCoincide[i][j] != true){
					isBingo[0][j] = false;
					isBingo[1][i] = false;
					if(i == j){
						isBingo[2][0] = false;
					}
					if(2-i == j){
						isBingo[2][1] = false;
					}
				}
			}
		}
		
		// boolean variable showing there is a bingo in matrix[][]
		boolean bingo = false;
		
		for(int i = 0 ; i < isBingo.length ; i++){
			for(int j = 0 ; j < isBingo[i].length ; j++){
				if(isBingo[i][j] == true){
					bingo = true;
				}
			}
		}
		
		if(bingo){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}