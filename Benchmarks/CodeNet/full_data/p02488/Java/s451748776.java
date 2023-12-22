import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str, strmin;
		strmin = scan.next();
		for (int i = 1; i < n; i ++) {
			str = scan.next();
			if (str.compareToIgnoreCase(strmin) < 0) strmin = str;
		}
		System.out.println(strmin);
	}
}