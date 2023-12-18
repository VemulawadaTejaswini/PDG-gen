import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			int aret = 0;
			int[] ret = new int[n];
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						aret++;
					}
				}
			}
			
			for(int k=0;k<n;k++) {
				for(int i=0;i<n;i++) {
					if(a[k]==a[i]) {
						ret[k]++;
					}
				}
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(aret-ret[i]+1);
			}
			
			
	    }
				
	}
