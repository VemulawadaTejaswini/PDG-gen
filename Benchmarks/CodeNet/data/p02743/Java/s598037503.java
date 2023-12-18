import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			
			double left = a*b;
			double right = Math.pow((c-a-b)/2.0, 2);
			
			if(left<right) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	    }
				
	}
	
