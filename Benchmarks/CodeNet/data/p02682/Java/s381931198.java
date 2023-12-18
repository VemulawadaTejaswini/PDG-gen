import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long k = sc.nextLong();
			
			long ab = a+b;
			long ret = 2*a-k+b;
			
			if(a>=k) {
				System.out.println(k);
				return;
			}else if(ab>=k) {
				System.out.println(a);
				return;
			}else {
				System.out.println(ret);
				return;
			}
		}
		
	}
