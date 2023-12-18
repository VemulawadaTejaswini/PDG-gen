
import java.util.Scanner;

public class Main {
	
	//AGC 017 Biscuits

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0 ;i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = a[i] % 2;
		}
		
		int x = 0;
		int y = 0;
		
		
		for(int i = 0 ; i < n ;i++) {
			if(b[i] == 0) {
				x++;
			}
		}
		y = n - x; 

		long []c = new long [y+1];
		
		c[0] = 1;
		
		for(int i = 1 ; i <= y ;i++) {
			c[i] = c[i-1] * (y+1-i)/i;
		}
		
		long ans = (long)Math.pow(2, x);
		
		if(p == 0) {
			long temp = 0;
			for(int i = 0 ; i <= y ; i+= 2) {
				temp += c[i];
			}
			System.out.println((temp*ans));
		}
		else {
			long temp = 0;
			for(int i = 1 ; i <= y;i+= 2) {
				temp += c[i];
			}
			System.out.println(temp*ans);
		}
	}
}
