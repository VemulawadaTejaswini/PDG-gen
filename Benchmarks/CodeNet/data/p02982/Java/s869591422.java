
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int D = input.nextInt();
      
		int X[][] = new int[N][D];
	
		for(int i = 0; i < N; i++){
			for(int j = 0; j < D; j++){
				X[i][j] = input.nextInt();
			}
		}
		int totalInt = 0;
		for(int k = 0; k < N; k++){
			
			for(int l = k+1; l < N; l++){
				int sum = 0; 
				for(int j = 0; j < D; j++){
					sum += Math.pow((X[k][j]-X[l][j]), 2);
				}
				double dist = Math.pow(sum, .5);
				if(dist == (int)dist){
					totalInt++;
				}
			}
				
		}
		System.out.println(totalInt);
		
		
	}	
}
