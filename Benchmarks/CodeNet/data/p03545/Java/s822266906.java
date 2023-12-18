import java.io.PrintStream;
import java.util.Scanner;
public class Main {
	final static PrintStream so = System.out;
	final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] a = sc.next().chars().map(i -> i-'0').toArray();
		String[] ops = new String[3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					ops[0] = i == 0 ? "+" : "-";
					ops[1] = j == 0 ? "+" : "-";
					ops[2] = k == 0 ? "+" : "-";
					if (ev(a, ops) == 7) {
						so.println(a[0] + ops[0] + a[1] + ops[1]+ a[2] + ops[2] + a[3] + "=7");
						return;
					}
				}
			}
		}
	}
	
	static int ev(int[] a, String[] ops) {
		int ans = a[0];
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("+")) ans += a[i+1];
			else ans -= a[i+1];
		}
		return ans;
	}
}
