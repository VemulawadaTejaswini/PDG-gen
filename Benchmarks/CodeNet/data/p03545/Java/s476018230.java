import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = Integer.parseInt(s.substring(0, 1));
		int b = Integer.parseInt(s.substring(1, 2));
		int c = Integer.parseInt(s.substring(2, 3));
		int d = Integer.parseInt(s.substring(3, 4));

		for(int i = 0 ; i < 1 << 3 ; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(a);
			int result = a;
			if((1 & i) == 1) {
				sb.append("+");
				result += b;
			} else {
				sb.append("-");
				result -= b;
			}
			sb.append(b);
			if((1 & i >> 1) == 1) {
				sb.append("+");
				result += c;
			} else {
				sb.append("-");
				result -= c;
			}
			sb.append(c);
			if((1 & i >> 2) == 1) {
				sb.append("+");
				result += d;
			} else {
				sb.append("-");
				result -= d;
			}
			sb.append(d);
			if(result == 7) {
				sb.append("=7");
				System.out.println(sb.toString());
				sc.close();
				return;
			}
		}
//		System.out.println();

		sc.close();

	}

}
