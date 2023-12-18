import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			int h = 0;
			int w = 0;
			int count = 0;
			
			Arrays.sort(a);
			
			for(int i=n-1;i>=1&&count<2;i--) {
				if(a[i]==a[i-1]) {
					count++;
					i--;
					if(h==0) {
						h = a[i];
					}else {
						w = a[i];
					}
				}
			}
			System.out.println(h*w);
		}
		
	}
