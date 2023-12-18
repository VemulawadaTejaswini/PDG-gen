import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] num = new int[n+1];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				num[a[i]]++;
			}
			
			int aret = 0;
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(a[i]==a[j]) {
						aret++;
					}
				}
			}
			
			for(int i=0;i<n;i++) {
				System.out.println(aret-num[a[i]]+1);
			}
			
			
	    }
				
	}
