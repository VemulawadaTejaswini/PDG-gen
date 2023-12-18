
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < n; i++) {
			list[i] = 10;
		}
		boolean suc = true;
		for(int i = 0; i < m; i++) {
			int s = sc.nextInt() - 1;
			int c = sc.nextInt();
			if(list[s] < 10 && list[s] != c)
				suc = false;
			else {
				list[s] = c;
			}
		}
		if(suc && list[0] != 0) {
			String ans = "";
			for(int i = 0; i < n; i++) {
				if(i == 0) {
					if(list[i] < 10) {
						ans += list[i];
					} else {
						ans += 1;
					}
				} else {
					if(list[i] < 10) {
						ans += list[i];
					} else {
						ans += 0;
					}
				}
			}
			System.out.println(ans);
		} else {
			System.out.println(-1);
		}

	}

}
