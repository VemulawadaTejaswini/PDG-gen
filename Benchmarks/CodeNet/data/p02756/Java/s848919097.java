import java.util.Scanner;

//AtCoder Beginner Contest 158
//D - String Formation
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		StringBuilder ans = new StringBuilder(S);
		int sw = -1; // -1:末尾 1:先頭

		int Q = Integer.parseInt(sc.next());
		for (int i = 0; i < Q; i++) {
			String t = sc.next();
			if (t.equals("1")) {
				sw *= -1;
			} else {
				String f = sc.next();
				String c = sc.next();
				if (sw == -1) {
					if (f.equals("2")) {
						// 末尾
						ans.append(c);
					} else {
						// 先頭
						ans.insert(0, c);
					}
				} else {
					if (f.equals("2")) {
						// 先頭
						ans.insert(0, c);
					} else {
						// 末尾
						ans.append(c);
					}
				}
			}

		}
		sc.close();
		if (sw == -1) {
			System.out.print(ans.toString());
		} else {
			System.out.print(ans.reverse().toString());
		}
	}
}
