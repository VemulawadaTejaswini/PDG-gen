import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		for (int a = 1; a <= n; a++) {
			for (int b = a; b <= n; b++) {
				if ((a + b) % k != 0) {
					b += k - (a + b) % k - 1;
					continue;
				}
				for (int c = b; c <= n; c++) {
					if ((b + c) % k != 0) {
						c += k - (b + c) % k - 1;
						continue;
					}
					if ((a + c) % k != 0) {
						c += k - (a + c) % k - 1;
						continue;
					}
					if ((b + c) % k == 0 && (c + a) % k == 0) {
						if (a == b) {
							if (b == c) {
								count++;
							} else {
								count += 3;
							}
						} else {
							if (b == c) {
								count += 3;
							} else {
								count += 6;
							}
						}
						c += k - 1;
					}
				}
				b += k - 1;
			}
		}
		System.out.println(count);
	}
}