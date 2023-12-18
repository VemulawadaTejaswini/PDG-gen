import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = sc.nextInt();
		}

		int []b = new int  [n+1];
		
		for(int i = 0 ; i < n-1 ; i++) {
			b[i] = a[i+1] + a[i] - x;
		}
		int ans = 0;
		
		for(int i = 0; i < n-1; i++){
			if(b[i] >0 && b[i+1] >=0) {
				ans += Math.max(b[i], b[i+1]);
				b[i] = 0;
				b[i+1] = 0;
			}
			if(b[i] <= 0 && b[i+1] > 0) {
				if(b[i+2] > 0) {
					continue;
				}
				if(b[i+2] <= 0) {
					ans += b[i+1];
					b[i+1] = 0;
				}
			if(b[i] > 0 && b[i+1] < 0) {
				ans += b[i];
				b[i] = 0;
 			}
		  }
		}
		System.out.println(ans);
		
	}

}
