import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int [n];
        for(int i = 0; i < n ; i++) {
        	v[i] = sc.nextInt();
        }
        solve(v);
	}

	private static void solve(int [] num) {
		Arrays.sort(num);
		double ans = num[0];
		for(int i = 1; i < num.length; i++) {
			ans = (ans + num[i]) / 2;
		}
		System.out.println(ans);
	}
}