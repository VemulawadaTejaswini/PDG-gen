import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] L = new int[n];
			int ret = 0;
			
			for(int i=0;i<n;i++) {
				L[i] = sc.nextInt();
			}
			
			Arrays.sort(L);
			
			for(int i=0;i<=n-3;i++) {
				for(int j=i+1;j<=n-2;j++) {
					for(int k=j+1;k<=n-1;k++) {
						
						if(L[i]==L[j]||L[j]==L[k]) {
							continue;
						}
						
						if(L[i]<L[j]+L[k]&&L[j]<L[i]+L[k]&&L[k]<L[i]+L[j]) {
							ret++;
						}
					}
				}
				
			}
			
			System.out.println(ret);
	    }
				
	}
	
