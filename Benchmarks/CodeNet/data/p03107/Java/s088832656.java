import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();

		int num0 = 0;
		for(char x : S.toCharArray()) {
			if(x == '0')
				num0++;
		}

		int num1 = 0;
		for(char x : S.toCharArray()) {
			if(x == '1')
				num1++;
		}

		System.out.println(Math.min(num0, num1)*2);

	}

}
