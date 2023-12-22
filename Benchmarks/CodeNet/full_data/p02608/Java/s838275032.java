import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int x = 1; ; x++) {
				if (i < (x*x + 3 + 2*x)) {
					break;
				}
				for (int y = 1; ; y++) {
					if (i < (x*x + y*y + 1 +x*y + y + x)) {
						break;
					}
					for (int z = 1; ; z++) {
						int m = x*x + y*y + z*z +x*y + y*z + z*x;
						if (m < i) {
							continue;
						} else if (m == i) {
							count++;
						} else {
							// オーバー
							break;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
