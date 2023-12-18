
public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int X = sc.nextInt();
		int cnt = X / 100;

		int res = 0;
		boolean t = false;
		for (int i = 0; i <= cnt; i++) {
			for (int j = 0; j <= cnt; j++) {
				for (int k = 0; k <= cnt; k++) {
					for (int l = 0; l <= cnt; l++) {
						for (int m = 0; m <= cnt; m++) {
							res = 105 * i + 104 * j + 103 * k + 102 * l + 101 * m;
							if (X - res == 0 || (X - res) % 100 == 0) {
								t = true;
								break;
							}
						}
						if (t) {
							break;
						}
					}
					if (t) {
						break;
					}
				}
				if (t) {
					break;
				}
			}
			if (t) {
				break;
			}
		}

		if (!t) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
	}
}