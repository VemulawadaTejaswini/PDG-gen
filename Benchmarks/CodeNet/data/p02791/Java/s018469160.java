
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(min >= a) {
				ans++;
				min = a;
			}
		}
		System.out.println(ans);
	}

}
