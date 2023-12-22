import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			long x = sc.nextLong();
			long en = 100;
			
			for(int i=1;;i++) {
				en = en + (en/100);

				if(en>=x) {
					System.out.println(i);
					return;
				}
			}
			
		}
		
		
		
	}
