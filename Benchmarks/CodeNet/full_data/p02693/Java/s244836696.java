import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int K = scan.nextInt();
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			for(int i = A;i<=B;i++) {
				if(i%K==0) {
					System.out.println("OK");
					System.exit(0);
				}
			}
			
			System.out.println("NG");
		}
		
		
	}
		

}
