import java.util.Scanner;


public class Main {
		public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		int ans = 0;
		if(n == 1) {
			System.out.println(0);
			return;
		}
		long tempN = n;
		for(long z = 2; z < n + 1; z++) {
			if(tempN < z) {
				break;
			}
			// z=nの場合
			if(z == tempN) {
				ans++;
				break;
			}
			// %=0の場合
			if(tempN % z == 0) {
				tempN = tempN / z;
				ans++;
			}
		}
		System.out.println(ans);
	}
}