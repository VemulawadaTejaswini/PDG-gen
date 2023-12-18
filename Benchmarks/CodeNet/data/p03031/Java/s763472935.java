import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []s = new int [m];
		int []p = new int [m];
		
		for(int i = 0; i<m ; i++) {
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				int ss = sc.nextInt();
				s[i] += Math.pow(2, ss - 1);
			}
	      }
		for(int i = 0 ; i< m ; i++) {
			p[i] = sc.nextInt();
		}
		
		int N = (int) Math.pow(2, n);
		int ans = 0;
		
		for(int i = 0; i < N ; i++) {
			boolean light = true;
			for(int j = 0; j < m ; j ++) {
				int amp = i & s[j];
				if((Integer.bitCount(amp)%2) != p[j] ) {
					light = false;
				}
			}
			if(light)
				ans++;
		
		}
		System.out.println(ans);
  
	}
}
