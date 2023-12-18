import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		int [] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = stdIn.nextInt();
		}
		
	
		
		long minmin = Long.MAX_VALUE;
		
		for(int i = 0; i < n-k+1; i++) {
			int min = Math.min(Math.abs(x[i]), Math.abs(x[i+k-1]));
			int max = Math.max(Math.abs(x[i]), Math.abs(x[i+k-1]));
			
			if(x[i+k-1] < 0) {
				minmin = Math.min(Math.abs(x[i]),minmin);
			}else if(0 < x[i]) {
				minmin = Math.min(x[i+k-1], minmin);
			}else {
				minmin = Math.min(minmin,2 * min + max);								
			}
			
		}
		
		System.out.println(minmin);
		
	}

}
