import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int one[][], i, j;
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		one = new int[r+1][c+1]; 
		
		for(i=0; i<r+1; i++){
			for(j=0; j<c+1; j++){		
				one[i][j] = 0;
			}
		}
		
		for(i=0; i<r; i++){
			for(j=0; j<c; j++){		
				int x = scan.nextInt();
				one[i][j] = x;
			}
		}
		
		for(i=0; i<r; i++){
			int sumx=0;
			for(j=0; j<c+1; j++){
				if(j == c+1){
					one[i][j] = sumx;
				}else{
					sumx += one[i][j];
				}
			}
		}
		
		for(i=0; i<c+1; i++){
			int sumy=0; 
			for(j=0; j<r+1; j++){
				if(j == r+1){
					one[j][i] = sumy;
				}else{
					sumy += one[j][i];
				}
			}
		}
		
		
		for(i=0; i<r+1; i++){
			for(j=0; j<c+1; j++){
				System.out.print(one[i][j]);
				if(j != c+1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}