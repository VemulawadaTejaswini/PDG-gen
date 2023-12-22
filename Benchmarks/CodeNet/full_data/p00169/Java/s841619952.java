import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String s[] = sc.nextLine().split(" ");
			int sum = 0;
			int aCount = 0;
			for (int i = 0; i < s.length; i++) {
				int a = Integer.valueOf(s[i]);
				if (a == 1) {
					aCount++;
					sum += 11;
				} else if (10 <= a) {
					sum += 10;
				} else {
					sum += a;
				}
			}
			while (21 < sum && 0 < aCount) {
				sum -= 10;
				aCount--;
			}
			if (21 < sum) {
				System.out.println("0");
			} else {
				System.out.println(sum);
			}
		}
	}
}