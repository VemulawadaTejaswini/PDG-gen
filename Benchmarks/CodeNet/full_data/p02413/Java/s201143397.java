import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int one[][], i, j;
		
		int r = scan.nextInt();
		int c = scan.nextInt();
		one = new int[r+1][c+1]; 
		
		for(i=0; i<=r; i++){
			for(j=0; j<=c; j++){		
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
			for(j=0; j<=c; j++){
				if(j==c){
					one[i][c] = sumx;
				}else{
					sumx += one[i][j];
				}
			}
		}
		
		for(i=0; i<=c; i++){ 
			int sumy=0;
			for(j=0; j<=r; j++){
				if(j==r){
					one[r][i] = sumy;
				}else{
					sumy += one[j][i];
				}
			}
		}
		
		
		for(i=0; i<=r; i++){
			for(j=0; j<=c; j++){
				System.out.print(one[i][j]);
				if(j != c){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}