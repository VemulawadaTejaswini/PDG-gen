import java.util.Scanner;

public class Main {

	private static String halfSpace = " ";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String tmp = scanner.nextLine();

		scanner.close();

		String[] tmpStrs = tmp.split(halfSpace);

		int a_button = Integer.parseInt(tmpStrs[0]);

		int b_button = Integer.parseInt(tmpStrs[1]);

		int count = 2;

		int max = 0;

		for(int i = 0; i < count; i++) {
			if(a_button > b_button) {
				max = max + a_button;
				a_button--;
			}else if(b_button > a_button) {
				max = max + b_button;
				b_button--;
			}else {
				max = max + a_button;
			}

		}

		System.out.println(max);
	}

}