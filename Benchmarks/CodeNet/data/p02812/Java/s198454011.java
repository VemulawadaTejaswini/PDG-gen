import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);
		int nm1 = sc.nextInt();
		String[] strArr = sc.next().split("");

		int count = 0;
		if (strArr.length > 3) {
			for (int i = 0; i < strArr.length - 2; i++) {
				if ("A".equals(strArr[i])) {
					if ("B".equals(strArr[i + 1])) {
						if ("C".equals(strArr[i + 2])) {
							count++;
						}
						continue;
					}
					continue;
				}
			}
		}

		System.out.println(count);

	}
}