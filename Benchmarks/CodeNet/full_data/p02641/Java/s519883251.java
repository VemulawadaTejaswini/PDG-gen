import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int n = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int abs = 200;
		int ans = 0;
		int alt = 0;

		for(int i = 0;i < n;i++) {
			list.add(scan.nextInt());
		}

		for(int i = 1;i <= 100;i++) {
			alt = 0 - i;
			if(!(list.contains(i))) {
				if(Math.abs(x - i) < abs) {
					abs = Math.abs(x - i);
					ans = i;
				}
			}
			if(Math.abs(x + alt) < abs) {
				if(ans >= Math.abs(alt)) {
					abs = Math.abs(x + alt);
					ans = alt;
				}
			}
		}

		if(n == 0) {
			System.out.println(x);
		}else {
			System.out.println(ans);
		}
	}
}
