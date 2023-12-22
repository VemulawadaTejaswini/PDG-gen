import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		Integer[] a = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		long cnt = 0;
		
		Arrays.sort(a,Collections.reverseOrder());
		

		if(n % 2 == 0) {
			cnt += a[0];
			
			for(int i = 1; i < n/2; i++) {
				cnt += (long)a[i]*2;
			}
			
		}else {
			cnt += a[0];
			for(int i = 1; i <= n/2; i++) {
				cnt += (long)a[i]*2;
				if(i== n/2-1)cnt -=a[i];
			}
			
		}
		
		System.out.println(cnt);
	}

}
