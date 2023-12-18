import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int k = sc.nextInt();
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < k; i++) {
			hs.add(sc.nextInt());
		}
		String s = "";
		boolean b;
		while (true) {
			b = true;
			s = String.valueOf(n);
			for (int i = 0; i < s.length(); i++) {
				if (hs.contains(s.charAt(i) - '0')) {
					b = false;
					break;
				}
			}
			if (b) {
				System.out.println(s);
				break;
			} else {
				n++;
			}
		}
	}
}
