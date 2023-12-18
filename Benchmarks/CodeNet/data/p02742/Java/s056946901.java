import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			long h = sc.nextLong();
			long w = sc.nextLong();
			
			if(h==1L || w==1L) {
				System.out.println(1);
				return;
			}
			
			if(h%2L==0L) {
				System.out.println(w*(h/2L));
			}else {
				System.out.println(w*(h/2L)+((w+2L-1L)/2L));
			}
		}
	}
