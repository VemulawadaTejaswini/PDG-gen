import java.util.*;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		long k = scan.nextLong();
		long[] a = new long[n], b = new long[m];
		
		for(int i=0; i<n; i++) a[i] = scan.nextLong();
		for(int i=0; i<m; i++) b[i] = scan.nextLong();
		
		int count = 0;
		int i = 0;
		
		while(k>0) {
			if(i<n) {
				k -= a[i];
				count++;
			}
			
			if(k == 0)
				break;
			else if(k<0) {
				count--;
				break;
			}
			
			if(i<m) {
				k -= b[i];
				count++;
			}
			
			if(k == 0)
				break;
			else if(k<0) {
				count--;
				break;
			}
			
			
			i++;
			if(i == Math.max(n, m))
				break;
		}
		
		System.out.println(count);

	}

}
