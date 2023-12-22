import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		boolean flg = false;
		for (int i = a; i <= b; i++) {
			if (i % k == 0) {
				flg = true;
				break;
			}
		}
		String result = "";
		if (flg) {
			result = "OK";
		} else {
			result = "NG";
		}
		System.out.println(result);

	}

}
