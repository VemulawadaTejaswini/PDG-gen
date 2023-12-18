import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();
		int idx = 0;
		int cnt = 0;
		while (true) {
			idx = str.indexOf("BW");
			if (idx == -1) {
			    break;
			} else {
				str = str.substring(0, idx) + "WB" + str.substring(idx + 2);
				cnt += 1;
			}
		}
		System.out.println(cnt);
		System.exit(0);
	}

}
