import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			int K = scan.nextInt();
			
			if(K<=A) {
				System.out.println(K);
			}else if(K<=A+B) {
				System.out.println(A);
			}else {
				int c = K-A-B;
				System.out.println(A+c*-1);
			}
			
		}
		
		
	}
		

}
