import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		List<String> route = new ArrayList<String>();

		boolean success = true;
		String s0 = sc.next();
		for (int i = 0; i < n; i++) {
			String s1 = "";
			if (i < n - 1) {
				s1 = sc.next();
			}
			if (s0.equals("AB")) {
				if (a == b) {
					if (s1.equals("AC") && c == 0) {
						a++;
						b--;
						route.add("A");
					} else if (s1.equals("BC") && c == 0) {
						a--;
						b++;
						route.add("B");
					} else {
						a++;
						b--;
						route.add("A");
					}
				} else if (a > b) {
					a--;
					b++;
					route.add("B");
				} else {
					a++;
					b--;
					route.add("A");
				}
			} else if (s0.equals("AC")) {
				if (a == c) {
					if (s1.equals("AB") && b == 0) {
						a++;
						c--;
						route.add("A");
					} else if (s1.equals("BC") && b == 0) {
						a--;
						c++;
						route.add("C");
					} else {
						a++;
						c--;
						route.add("A");
					}
				} else if (a > c) {
					a--;
					c++;
					route.add("C");
				} else {
					a++;
					c--;
					route.add("A");
				}
			} else if (s0.equals("BC")) {
				if (b == c) {
					if (s1.equals("AB") && a == 0) {
						b++;
						c--;
						route.add("B");
					} else if (s1.equals("AC") && a == 0) {
						b--;
						c++;
						route.add("C");
					} else {
						b++;
						c--;
						route.add("B");
					}
				} else if (b > c) {
					b--;
					c++;
					route.add("C");
				} else {
					b++;
					c--;
					route.add("B");
				}
			}

			if (a < 0 || b < 0 || c < 0) {
				success = false;;
				break;
			}
			s0 = s1;
		}

		// 出力
		if (!success) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			route.forEach( s -> {
				System.out.println(s);
			});
		}
		sc.close();
	}
}
