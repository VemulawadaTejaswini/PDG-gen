import java.math.*;
import java.util.*;
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int p[] = new int[n];
			
			int flg = 0;
			int sum = 0;
			
			for(int i=0;i<n;i++) {
				p[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<i;j++) {
					if(p[j]<p[i]) {
						flg =1;
						break;
					}
				}
				
				if(flg==0) {
					sum++;
				}
								
			}
			
			
			System.out.println(sum);
			
			
		}
				
	}