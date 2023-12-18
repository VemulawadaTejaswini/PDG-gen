import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int t = sc.nextInt();
			if (t == 1) {
				StringBuffer hanten = new StringBuffer(s);
				s = hanten.reverse().toString();
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if (f == 1) {
					s = s + c;
				} else {
					s = c + s;
				}
			}
		}
		System.out.println(s);
		sc.close();
	}
}