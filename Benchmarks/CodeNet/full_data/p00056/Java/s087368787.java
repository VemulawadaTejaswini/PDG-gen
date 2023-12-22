import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		int[] p = new int[50000+1];
		p[0] = p[1] = 0;
		for(int i = 2; i <= 50000; i++) {
			p[i] = 1;
		}
		for(int i = 2; i <= Math.sqrt(50000)+1; i++) {
			if(p[i] == 1) {
				for(int j = i*2; j <= 50000; j+=i) {
					p[j] = 0;
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			int ans = 0;
			for(int i = 2; i <= n/2; i++) {
				if(p[i] == 1 && p[n-i] == 1) {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}