import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int a[] = new int[n];
						
			for(int i=0;i<n;i++) {
				a[i]= sc.nextInt();
			}
			
			for(int k=1;k<=n;k++) {
				int nA = 0;
				int kA = 0;
				
				for(int i=1;i<=n;i++) {
					
					for(int j=i+1;j<=n;j++) {
						if(a[i]==a[j]) {
							nA++;
						}
						
						
					}
				}
				
				for(int h=1;h<=n;h++) {
					if(k==h) {
						continue;
						
					}else if(a[k]==a[h]){
							kA++;
					}
					
				}
				
				System.out.println(nA-kA);
			}
			
			
		}

	}