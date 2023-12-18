import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		long count = 0l;
		long i = 0l;
		while (true) {
			long num = 2019l * ++i;
			if (num < 0l || num > 20000000l) {
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
					copy = copy.substring(index + 3);
				}
			}
		}
		System.out.println(count);
	}
}
