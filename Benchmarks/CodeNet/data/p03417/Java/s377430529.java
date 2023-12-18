import java.util.Scanner;

public class Main{
	
	static int ROW = 0; 
	static int COL = 0;
	static boolean mas[][];
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ROW = sc.nextInt();
		COL = sc.nextInt();
		
		mas = new boolean[ROW][COL];
		
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				mas[i][j]=false;
			}
		}
		
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				reverce(mas,i,j);
			}
		}
		
		int count = 0;
		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				if(mas[i][j]){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
	
	public static void reverce(boolean mas[][],int row,int col){
		
		mas[row][col] = !mas[row][col] ;

		if(col!=0){
			mas[row][col-1] = !mas[row][col-1];
		}
		
		if(col!=COL-1){
			mas[row][col+1] = !mas[row][col+1];
		}
		
		if(row!=0){
			mas[row-1][col] = !mas[row-1][col];
			
			if(col!=0){
				mas[row-1][col-1] = !mas[row-1][col-1];
			}
			
			if(col!=COL-1){
				mas[row-1][col+1] = !mas[row-1][col+1];
			}
		}
		
		if(row!=ROW-1){
			mas[row+1][col] = !mas[row+1][col];
			
			if(col!=0){
				mas[row+1][col-1] = !mas[row+1][col-1];
			}
			
			if(col!=COL-1){
				mas[row+1][col+1] = !mas[row+1][col+1];
			}
		}
	}
}