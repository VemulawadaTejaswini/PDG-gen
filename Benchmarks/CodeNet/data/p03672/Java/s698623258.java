import java.util.*;

public class Main {
    public static void main(String []args) throws Exception {
    	Main o = new Main();
        o.run();
    }

	void run() throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char []chars = s.toCharArray();
		int len = chars.length / 2;
		while (len > 0) {
			len--;
			if (match(chars, len)) {
				System.out.println(len * 2);
				return;
			}
		}
	}

	boolean match(char[]chars, int off) {
		int last = off * 2;
		for (int i = 0; i < off; i++) {
			char c1 = chars[i];
			char c2 = chars[i + off];
			if (c1 != c2) {
				return false;
			}
		}
		return true;
	}
}
