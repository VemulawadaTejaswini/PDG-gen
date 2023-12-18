import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		// --- input ---
		int val = toInt(in.readLine());
		int[][] data = new int[val][];
		for(int i=0; i < val; i++) {
			data[i] = toIntAry(in.readLine().split(" "));
		}

		// --- resolv ---
		int[] cur = {0, 0, 0};
		int[] mv = new int[3];
		for(int[] next : data) {

			for(int i=0; i < 3; i++) {
				mv[i] = Math.abs(next[i] - cur[i]);
			}

			if(mv[0] < (mv[1] + mv[2]) || mv[0] % 2 != (mv[1] + mv[2]) % 2) {
				System.out.println("No");
				return;
			}

			// current
			cur = next;
		}

		System.out.println("Yes");
	}

	public static int toInt(String val) {
		return Integer.parseInt(val);
	}

	public static int[] toIntAry(String[] vals) {
		int[] vAry = new int[vals.length];
		for(int i=0; i < vals.length; i++) {
			vAry[i] = toInt(vals[i]);
		}
		return vAry;
	}
}