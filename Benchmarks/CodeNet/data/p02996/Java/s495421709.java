import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int[] b2 = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				b2[i] = b[i];
			}
			
			Arrays.sort(b2);
			
			int bmax = b2[n-1];
			
			int[] num = new int[bmax+1];
			
			for(int i=0;i<n;i++) {
				num[b[i]]+=a[i];
			}
			
			int sum = 0;
			
			for(int i=1;i<=bmax;i++) {
				sum+=num[i];
				if(sum>i) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
		
	}
