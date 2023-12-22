import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			
			int ret = n;
			
			if(a[0]==a[1]) {
				ret--;
			}
			
			for(int i=1;i<n;i++) {
				for(int j=0;j<i;j++) {
					if(a[i]%a[j]==0) {
						ret--;
						break;
					}
				}
			}
			
			System.out.println(ret);
		}
	}
