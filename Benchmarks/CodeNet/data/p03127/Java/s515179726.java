
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lastmons = 1000000000;
		int monster[] = new int[n];
		for(int i=0;i<n;i++) {
			monster[i] = sc.nextInt();
		}
		/*
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int ans = euclide(monster[i], monster[j]);
				lastmons = Math.min(ans, lastmons);
			}
		}
		*/
		
		for(int i=0;i<n-1;i++) {
			int ans = euclide(monster[i], monster[i+1]);
			monster[i+1] = ans;
		}
		
		sc.close();
		System.out.println(monster[n-1]);
		
		
	}
	
	
	public static int euclide(int a, int b) {

		while(true) {
			if(a==b) {
				return a;
			}
			if(a>b) {
				a -= b;
			}else {
				b -= a;
			}
		}
	}

}
