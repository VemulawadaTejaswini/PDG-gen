import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String scStr = scanner.nextLine();
		int count = scStr.length() / 5;

		String dream = "dream";
		String dreamer = "dreamer";
		String erase = "erase";
		String eraser = "eraser";

		boolean result = false;
		boolean isEnd = false;

		StringBuilder sb = new StringBuilder(scStr);
		for (int i = 0; i <= count; i++) {
			if (isEnd == true)
				break;
			if (scStr.startsWith(dreamer)) {
				scStr = scStr.substring(7);
			} else if (scStr.startsWith(dream)) {
				scStr = scStr.substring(5);
			} else if (scStr.startsWith(eraser)) {
				scStr = scStr.substring(6);
			} else if (scStr.startsWith(erase)) {
				scStr = scStr.substring(5);
			} else if (scStr.length() <= 7) {
				if (scStr.length() == 0) {
					result = true;
				} else if (scStr.length() == 7 && (scStr.startsWith(dreamer))) {
					result = true;
					isEnd = true;
				} else if (scStr.length() == 6 && (scStr.startsWith(eraser))) {
					result = true;
					isEnd = true;
				} else if (scStr.length() == 5 && (scStr.startsWith(dream) || scStr.startsWith(erase))) {
					result = true;
					isEnd = true;
				}else {
					isEnd = true;
				}
			}
		}
		if (result == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}