import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int inCnt = 0;
		while ((s = stdIn.readLine()) != null) {
			inCnt++;
			String[] se = s.split(" ");
			int h = Integer.valueOf(se[0]);
			int w = Integer.valueOf(se[1]);
			if (h == 0 && w == 0)
				break;
			doMain(inCnt, h, w);
		}
		System.exit(0);
	}

	private static void doMain(int inCnt, int h, int w) {
		for (int i = 0; i < h; i++) {
			String p = "";
			for (int j = 0; j < w; j++)
				p = p.concat("#");
			System.out.println(p);
		}
	}
}