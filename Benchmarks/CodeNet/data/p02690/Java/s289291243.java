import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			
			long a;
			long b;
			
			for(long i=-1000;i<=1000;i++) {
				for(long j=-1000;j<=1000;j++) {
					long cal = ((i*i*i*i*i)-(j*j*j*j*j));
					if(cal==x) {
						System.out.println(i+" "+j);
						return;
					}
				}
			}
			
			
		}
		
		
	}
