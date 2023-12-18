
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		boolean ans = true;
		int count = 0;
		if (w.length() % 2 == 1) {
			ans = false;
		}
		for (int i = 0; i < w.length(); i++) {
			for(int j = 1; j < w.length(); j++) {
				int k = i + j;
				if (w.charAt(i) == w.charAt(k)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
