import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		String s = "";
		String key = "";
		int chk = 0;
		int tmp = 0;

		System.out.println(0);
		System.out.flush();
		s = sc.next();
		if (s.equals("Vacant")) {
			System.exit(0);
		} else {
			key = s;
			chk = N / 2;
			if (chk % 2 == 1) {
				if (key.equals("Male")) {
					key = "Female";
				} else {
					key = "Male";
				}
			}
			while (true) {
				System.out.println(chk);
				System.out.flush();
				s = sc.next();
				if (s.equals("Vacant")) {
					System.exit(0);
				} else {
					if (s.equals(key)) {
						tmp = chk;
						chk = (N + chk) / 2;
						if ((chk - tmp) % 2 == 1) {
							if (key.equals("Male")) {
								key = "Female";
							} else {
								key = "Male";
							}
						}
					} else {
						tmp = chk;
						chk = chk / 2;
						if ((tmp - chk) % 2 == 1) {
							if (key.equals("Male")) {
								key = "Female";
							} else {
								key = "Male";
							}
						}
					}
				}
				continue;
			}
		}

	}
}
