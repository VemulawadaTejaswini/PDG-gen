import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(alphabet(n));
	}
	
	public static String alphabet(int num) {
		int firstAlpha = (int)'a';
		int sizeAlpha = 26;

		if (num <= sizeAlpha) {
			return String.valueOf((char)(firstAlpha + num - 1));
		} else {
			int offset = num - 1;
			int tmp = offset;
			String str = "";
			while(true) {
				int div = tmp / sizeAlpha;
				int m = tmp % sizeAlpha;
				str = alphabet(m + 1) + str;
				if (div <= 0)
					break;
				tmp = (div - 1);
			}
			return str;
		}
	}
}
