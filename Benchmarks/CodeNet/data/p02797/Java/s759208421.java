import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int k = sc.nextInt();
			int s = sc.nextInt();
			int a = 0;
			int b = 0;
			
			
			if(s%2==1) {
				a = s/2;
				b = a+1;
			}else {
				a = s/2;
				b = a;
			}
			
			if(k==n) {
				for(int i=1;i<=n-1;i++) {
					System.out.print(s+" ");
				}
				System.out.print(s);
			}else {
				if(k%2==1) {
					for(int i=1;i<=(k+1)/2;i++) {
						System.out.print(a+" "+b+" ");
					}
					for(int i=1;i<n-k-1;i++) {
						System.out.print((s+1)+" ");
					}
					System.out.print((s+1));
				}else {
					for(int i=1;i<=k/2;i++) {
						System.out.print(a+" "+b+" ");
					}
					System.out.print(a+" ");
					for(int i=1;i<n-k-1;i++) {
						System.out.print((s+1)+" ");
					}
					System.out.print((s+1));
				}
			}
		}
		
	}
