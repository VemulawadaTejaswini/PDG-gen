import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long d = scan.nextInt();
		d *= d;
		
		long[] x = new long[n];
		long[] y = new long[n];
		long[] dis = new long[n];
		
		for(int i = 0; i < n; i++) {
			x[i] = scan.nextLong();
			y[i] = scan.nextLong();
			dis[i] = x[i] * x[i] + y[i] * y[i]; 
		}
		int ans = 0;
		
		for( int i = 0; i < n; i++) {
			if(dis[i] <= d) {
				ans++;
			}
		}
		
		System.out.print(ans);
	}

}
