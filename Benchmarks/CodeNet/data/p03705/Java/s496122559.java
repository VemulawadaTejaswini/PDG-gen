import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>b||(n==1&&a!=b)||(n!=1&&a==b)) {
				System.out.println(0);
				return;
			}
			
			System.out.println((a+b+(n-2)*b)-(a+b+(n-2)*a)+1);
			
	    }
				
	}
