import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 4; j <= s.length(); j++) {
				String num = s.substring(i, j);
				while (num.length() > 5) {
					if (Integer.parseInt(num.substring(0, 4)) < 8076) {
						int tmp = Integer.parseInt(num.substring(0, 5)) / 2019;
						int rest = Integer.parseInt(num.substring(0, 5)) - 2019 * tmp;
						if (rest != 0)
							num = String.valueOf(rest) + num.substring(5, num.length());
						else
							num = num.substring(5, num.length());
					} else {
						int tmp = Integer.parseInt(num.substring(0, 4)) / 2019;
						int rest = Integer.parseInt(num.substring(0, 4)) - 2019 * tmp;
						if (rest != 0)
							num = String.valueOf(rest) + num.substring(4, num.length());
						else
							num = num.substring(4, num.length());
					}
				}
				if(Integer.parseInt(num) % 2019 == 0) count++;
			}
		}
		System.out.println(count);
	}
}
