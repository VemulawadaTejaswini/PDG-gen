import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			long[] a = new long[n+2];
			long[] b = new long[n+2];
			
			
			for(int i=1;i<=n;i++) {
				a[i] = sc.nextInt();
			}
			
			a[0]=0;
			
			
			b[0]=Math.abs(a[0]);
			b[n+1]=Math.abs(a[n]);
			
			
			for(int i=1;i<=n+1;i++) {
				b[i] = Math.abs(a[i]-a[i-1]);
			}
			
			
			
			long sum = 0;
			
			for(int i=1;i<=n;i++) {
				sum = 0;
				for(int j=1;j<=n+1;j++) {
					if(j==i) {
						
						if((a[j-1]<=a[j]&&a[j]<=a[j+1])||(a[j-1]>=a[j]&&a[j]>=a[j+1])) {
							
						}else {
							sum+=Math.abs((b[j]-b[j+1]));
							j++;
							continue;
						}
					}
					
					sum+=b[j];
				}
				System.out.println(sum);
				
				
			}
	       
		}
		
	}
