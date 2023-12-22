import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] b = new int[n-1];
			long[] c = new long[n];
			long sum = 0;
			
			for(int i=0;i<n;i++){
				sum += sc.nextInt();
			}
			for(int i=0;i<n-1;i++){
				b[i] = sc.nextInt();
			}
			Arrays.sort(b);
			
			long p = 0;
			for(int i=0;i<n;i++){
				c[i] = (sum+p)*(n-i);
				if(i!=n-1)p+=b[n-2];
			}
			Arrays.sort(c);
			
			System.out.println(c[n-1]);
		}
	
	}	
}