import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int[] A  = new int[N];
			
			for(int i=0;i<N;i++) {
				A[i] = scan.nextInt();
				//System.out.println(A[i]);
			}
			
			
			Arrays.sort(A);
			int ok = 1;
			
			//System.out.println(N);
			for(int k = 0;k<N-1;k++) {
				//System.out.println("nono");
				
				if(A[k] == A[k+1]) {	
					ok=0;
					break;
				}
			}
			
			
			System.out.println(ok==1?"YES":"NO");
			

			
			
			
			
		}
		
		
	}
		

}
