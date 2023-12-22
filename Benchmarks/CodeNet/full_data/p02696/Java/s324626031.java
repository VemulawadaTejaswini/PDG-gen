import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long A = scan.nextLong();
			long B= scan.nextLong();
			long N = scan.nextLong();
			
			for(int i = 0;i<=N;i++) {
				
				 long s = (A*i)/B-A*(i/B);
				
				//System.out.println(s);
			}
			
			if(B<N) {
				 long s = (A*B)/B-A*(B/B);
				 System.out.println(s);
				 
			}else {
				long s = (A*N)/B-A*(N/B);
				 System.out.println(s);
			}
			
		}
		
		
	}
		

}
