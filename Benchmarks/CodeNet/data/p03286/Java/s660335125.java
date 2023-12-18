import java.util.Scanner;

public class Main{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int cnt = 0;

			while (true) {
				String binary = Integer.toBinaryString(cnt);
				cnt++;

				if (n == 0) {
					System.out.println(0);
					break;
				} else if (Math.abs(Math.pow(-2, binary.length()-1)) < Math.abs(n/2)) {
					continue;
				}

				int ans = 0;
				for (int i=0; binary.length() >= i+1; i++) {
					if (binary.charAt(i) == '1') {
						ans = ans + (int)Math.pow(-2, binary.length()-1-i);
					}
				}
				if (n == ans) {
					System.out.println(binary);
					break;
				}
			}
		}
	}

}
