import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int m = sc.nextInt();
			int c = sc.nextInt();	
			int[] b = new int[m];
			
			for(int i=0;i<m;i++) {
				b[i] = sc.nextInt();
			}
			
			int ret = 0;
			
			for(int i=0;i<n;i++) {
				int x = 0;
				for(int j=0;j<m;j++) {
					x += b[j]*sc.nextInt();
				}
				
				if((x+c)>0) {
					ret++;
				}
			}
			
			System.out.println(ret);
			
		}
	}
