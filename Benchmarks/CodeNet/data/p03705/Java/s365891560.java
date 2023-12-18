import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			if(a>b||(n==1&&a!=b)||(n!=1&&a==b)) {
				System.out.println(0);
				return;
			}
			if(n==1&&a==b) {
				System.out.println(1);
				return;
			}
			
			System.out.println((a+b+(n-2)*b)-(a+b+(n-2)*a)+1);
			
	    }
				
	}