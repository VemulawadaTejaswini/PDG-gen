import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a;
		ArrayList<Integer> hoge = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			a = sc.nextInt();
			hoge.add(a);
		}
		int c;
		int b;
		long bsum = 0;
		for (int i = 1; i <= m; i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			for (int j = 1; j <= b; j++) {
				hoge.add(c);
				bsum++;
			}
		}

		Collections.sort(hoge);

		int ans = 0;
		for (int i = hoge.size()-1; i >= hoge.size() - n; i--) {
			ans+=hoge.get(i);
		}
System.out.println(ans);
	}
}