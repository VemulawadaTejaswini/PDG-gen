	import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();	
			int k = sc.nextInt();
			
			int p[] = new int[n];
			double ep[] = new double[n];
			double sumep[] = new double[n];
			List<Double>  ksumep = new ArrayList<Double>();
			
			for(int i=0;i<n;i++) {
				p[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				ep[i] = (1+p[1])/2;
			}
			
			for(int i=0;i<n;i++) {
				if(i==0) {
					sumep[i]=ep[i];
				}else {
					sumep[i]=sumep[i-1] + ep[i-1];
				}
			}
			
			for(int i=0;i<n-k+1;i++) {
				if(i==0) {
					ksumep.add(sumep[i+k-1]) ;
				}else {
					ksumep.add(sumep[i+k-1]-sumep[i-1]) ;
				}
			}
			
			Collections.sort(ksumep,Collections.reverseOrder());
			
			System.out.println(ksumep.get(0));
		}
				
	}