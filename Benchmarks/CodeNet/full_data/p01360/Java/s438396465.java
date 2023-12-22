import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	boolean isValid(int l, int r) {
		if (r == l) return false;
		if (r % 3 == 0 || l % 3 == 1) return true;
		if (r % 3 == l % 3) return true;
		return false;
	}
	
	int calc(int l, int r, int n, int[] step, int turn) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (turn == 0) {
				if (isValid(l, step[i])) {
					r = step[i];
					turn = 1;
				} else {
					count++;
					l = step[i];
				}
			} else {
				if (isValid(step[i], r)) {
					l = step[i];
					turn = 0;
				} else {
					count++;
					r = step[i];
				}
			}
		}
		
		return count;
	}
	
	void run() {
		while (true) {
			String s = sc.nextLine();
			if (s.equals("#")) break;
			
			int n = s.length();
			int[] step = new int[n];
			for (int i = 0; i < n; i++)
				step[i] = Character.getNumericValue(s.charAt(i));
			
			int min = n;
			int r, l, turn;
			r = step[0];
			l = 4;
			turn = 1;
			min = Math.min(min, calc(l,r,n,step,turn));
			
			r = 6;
			l = step[0];
			turn = 0;
			min = Math.min(min, calc(l,r,n,step,turn));
			
			out.println(min);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}