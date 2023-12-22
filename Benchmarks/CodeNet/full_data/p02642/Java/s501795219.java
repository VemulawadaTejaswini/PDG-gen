import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int[] a = new int[n];
			HashSet<Integer> h = new HashSet<Integer>();
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			int ret = n;
			
			for(int i=0;i<n;i++) {
				if(i<n-1) {
					if((a[i]==a[i+1])) {
						ret--;
						for(int j=1;j*a[i]<=a[n-1];j++) {
							h.add(j*a[i]);
						}
						continue;
					}
				}
				
				
				if(!h.contains(a[i])) {
					for(int j=1;j*a[i]<=a[n-1];j++) {
						h.add(j*a[i]);
					}
				}else {
					ret--;
				}
			}
			
			
			System.out.println(ret);
		}
	}
