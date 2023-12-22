import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	String s;
	
	public void run() {
		while (true) {
			s = in.next();
			if (s.matches("#")) break;
			boolean leftFoot = true;
			boolean rightFoot = true;
			int left = 0, right = 0;
			int before = (s.charAt(0) - '0') % 3;
			if (before == 0) before = 3;
			for (int i = 1; i < s.length(); i++) {
				int next = (s.charAt(i) - '0') % 3;
				if (next == 0) next = 3;
				if ((before > next && leftFoot) || (before < next && !leftFoot)) {
					left++;
				} else {
					leftFoot = !leftFoot;
				}
				if ((before < next && rightFoot) || (before > next && !rightFoot)) {
					right++;
				} else {
					rightFoot = !rightFoot;
				}
				before = next;
			}
			System.out.println(Math.min(left, right));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}