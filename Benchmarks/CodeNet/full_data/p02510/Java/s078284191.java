import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.next();
			if(str.equals("-")){
				break;
			}
			int m = sc.nextInt();
			int h[] = new int[m];
			for (int i = 0; i < m; i++) {
				h[i] = sc.nextInt();
			}
			for (int i = 0; i < m; i++) {
				str = func(str, h[i]);
			}
			System.out.println(str);
		}

	}

	public static String func(String str, int n) {
		int length = str.length();
		String str1 = str.substring(0, n);
		String str2 = str.substring(n, length);
		return str2 + str1;
	}
}