import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			long n = sc.nextLong();
			long a[] = new long[(int)n];
						
			for(int i=0;i<n;i++) {
				a[i]= sc.nextLong();
			}
			
			for(int k=1;k<=n;k++) {
				long nA = 0;
				long kA = 0;
				
				for(int i=1;i<=n;i++) {
					
					for(int j=1;j<=n;j++) {
						if(j<=i) {
							continue;
						}
						
						if(a[i-1]==a[j-1]) {
							nA++;
						}
						
						
					}
				}
				
				for(int h=1;h<=n;h++) {
					if(k==h) {
						continue;
						
					}else if(a[k-1]==a[h-1]){
							kA++;
					}
					
				}
				
				System.out.println(nA-kA);
			}
			
			
		}

	}