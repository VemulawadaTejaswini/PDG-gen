import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0064
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int res = 0, tmp = 0, mode = 0;
		boolean isn = false;
		while (sc.hasNext()) {
			char[] cs = sc.next().toCharArray();
			for (int i = 0; i < cs.length; i++) {
				isn = Character.isDigit(cs[i]);
				if (mode == 0) {
					if (isn) {
						mode = 1;
						tmp = cs[i] - '0';
					}
				} else {
					if (isn) {
						tmp = tmp * 10 + (cs[i] - '0');
					} else {
						mode = 0;
						res += tmp;
						tmp = 0;
					}
				}
			}
			res += tmp;
			tmp = 0;
		}
		System.out.println(res);
	}
}