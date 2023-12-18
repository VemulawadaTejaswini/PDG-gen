import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] X = new int[N];
		
		for(int i = 0 ; i < N ; i++){
			X[i] = scan.nextInt();
		}
		
		if( N%2 == 1 ){
			System.out.println("input error");	
		}
		else if( N == 2 ){
			System.out.println(X[1]);
			System.out.println(X[0]);
		}
		else{
			for(int index = 0 ; index < N ; index++){
				
				if (index < N/2){
					System.out.println(X[N/2]);		
				}
				else{
					System.out.println(X[(N/2-1)]);			
				}
			}	
		}
	}
}
