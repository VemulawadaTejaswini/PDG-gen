import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int k = sc.nextInt();
			long ret=0;
			
			for(int i=1;i<=k;i++) {
				for(int j=1;j<=k;j++) {
					for(int m=1;m<=k;m++) {
						ret+=gcd(gcd(i,j),m);
					}
				}
			}
			
			System.out.println(ret);
			
		}
		
		
		static int gcd (int a, int b) {
			int temp;
			while((temp = a%b)!=0) {
				a = b;
				b = temp;
			}
			return b;
		}
	}