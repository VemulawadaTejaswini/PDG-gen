
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		int []b = new int [n];
		
		long asum = 0;
		long bsum = 0;
		
		for(int i = 0  ; i < n ; i++) {
			a[i] = Integer.parseInt(sc.next());
			asum += (long)a[i];
		}
		for(int i = 0 ;i < n ;i++) {
			b[i] = Integer.parseInt(sc.next());
			bsum += (long)b[i];
		}
		
		long cnt = bsum - asum;
		
		long acnt = 0;
		long bcnt = 0;
		
		for(int i = 0 ; i < n ;i++) {
			if(a[i] > b[i]) {
				acnt += (long)a[i] - b[i];
			}
			else {
				bcnt += (long)(b[i] - a[i] + 1)/2;
				if((b[i] - a[i]) % 2 == 1)  bcnt++;
			}
		}
		
		if(cnt == acnt || cnt == bcnt) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
