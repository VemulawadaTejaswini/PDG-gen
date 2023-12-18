
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		while(n != 0) {
			int max = 1;
			for(int i = 1; i < n; i++) {
				int tmp = (int) Math.pow(6, i);
				if(tmp <= n) {
					max = Math.max(max, tmp);
				} else {
					break;
				}
			}
			for(int i = 1; i < n; i++) {
				int tmp = (int) Math.pow(9, i);
				if(tmp <= n) {
					max = Math.max(max, tmp);
				} else {
					break;
				}
			}
			n -= max;
			ans++;
		}
		System.out.println(ans);
	}

}
