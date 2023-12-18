import java.util.Arrays;
import java.util.Scanner;


	public class Main {
		

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        
			int n = sc.nextInt();
			int c = sc.nextInt();
			int k = sc.nextInt();
	        int[] t = new int[n];
			
	        for(int i=0;i<n;i++) {
	        	t[i] = sc.nextInt();
	        }
	        
	        Arrays.sort(t);
	        int ret = 0;
	        
	        for(int i=0;i<n;) {
	        	for(int j=1;j<=c;j++) {
	        		i++;
	        		if(i-1+j<=n-1&&t[i-1]+k<t[i-1+j]) {
	        			break;
	        		}
	        	}
	        	
	        	ret++;
	        }
	        
	        System.out.println(ret);
		}
		
	}
