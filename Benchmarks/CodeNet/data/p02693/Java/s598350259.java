import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int k = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int n = a/k;
			if(k*n>=a&&k*n<=b) {
				System.out.println("OK");
				return;
			}
			
			if(k*(n+1)>=a&&k*(n+1)<=b) {
				System.out.println("OK");
				return;
			}
			
			System.out.println("NG");
			
		}
		
		
		
	}
