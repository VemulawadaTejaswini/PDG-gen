import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		String[] array = new String[h];
		for (int i = 0; i < h; i++) {
			array[i] = sc.next();
		}
		int ans = 0;
		for (int is = 0; is < (1 << h); is++) {
			for (int js = 0; js < (1 << w); js++) {
				int cnt = 0;
				for (int i = 0; i < w; i++) {
					for (int j = 0; j < w; j++) {
						if (((is >> i) & 1) == 1) {
							continue;
						}
						if (((js >> j) & 1) == 1) {
							continue;
						}
						if (array[i].charAt(j) == '#') {
							cnt++;
						}
					}
				}
				if (cnt == k) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}