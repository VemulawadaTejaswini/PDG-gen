import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N =scan.nextInt();
			int M =scan.nextInt();
			int []A = new int[M];
			long goukei = 0;
			for(int i = 0;i<M;i++) {
				A[i] = scan.nextInt();
				goukei+=A[i];
			}
			
			System.out.println(N-goukei>=0?N-goukei:-1);
			
			
		}
		
		
	}
		

}
