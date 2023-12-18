import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			long n = sc.nextLong();
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long a1 = n/(a+b)*a;
			long a2;
			long c = n%(a+b);
			if(c<=a) {
				a2 =c;	
			}else {
				a2 =a;
			}
			
			if(a==0) {
				System.out.println(0);
			}else {
				System.out.println(a1+a2);
			}
			
			
		}

	}