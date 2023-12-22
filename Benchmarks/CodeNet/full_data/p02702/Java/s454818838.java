import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		long count = 0l;
		int i = 0;
		while (true) {
			long num = 2019l * ++i;
			if (num > 2000000l) {
				break;
			}
			String tmp = "" + num;
			String copy = str;
			while (true) {
				int index = copy.indexOf(tmp);
				if (index < 0) {
					break;
				} else {
					++count;
					copy = copy.substring(index + 4);
				}
			}
		}
		System.out.println(count);
	}
}
