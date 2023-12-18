import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int D = input.nextInt();
		
		int X[][] = new int[N][D];
		
		for(int i = 0; i < N; N++){
			for(int j = 0; j < D; D++){
				X[i][j] = input.nextInt();
			}
		}
		int length = X.length;
		int totalInt = 0;
		for(int k = 0; k < length; k++){
			int sum = 0; 
			if(k == length-1){
				for(int j = 0; j < D; j++){
					sum = (int) (sum + Math.pow((X[k][j]-X[0][j]), 2));
				}
			}else{
				for(int j = 0; j < D; j++){
					sum = (int) (sum + Math.pow((X[k][j]-X[k+1][j]), 2));
				}
			}
			
			double dist = Math.pow(sum, .5);
			if(dist == (int)dist){
				totalInt++;
			}
		}
		System.out.println(totalInt);
		
		
	}
}
