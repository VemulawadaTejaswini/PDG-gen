import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			long[]a= new long[N];
			long goukei = 1;
			long S = (long)1e18;
			
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextLong();
				
				goukei = goukei*a[i];
				
				
			
			}
			
			if(goukei>S) {
				System.out.println(-1);
				System.exit(0);
			}
			
			System.out.println(goukei);
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
