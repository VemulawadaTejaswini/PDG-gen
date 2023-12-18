import java.util.*;

public class Main {
	static int h;
	static int w;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		h = sc.nextInt();
		w = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (check(sc.nextInt(), sc.nextInt())) {
				count++;
			}
        }
		System.out.println(count);
	}
	
	static boolean check(int hh, int ww) {
		if (hh >= h && ww >= w) {
			return true;
		}
		return false;
	}
}
