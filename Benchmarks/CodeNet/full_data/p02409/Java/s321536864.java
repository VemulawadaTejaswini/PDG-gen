import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = stdIn.readLine()) != null) {
			int cnt = Integer.valueOf(s);
			Domi aUniv = new Domi();
			aUniv.init();
			for (int i = 0; i < cnt; i++) {
				aUniv.moving(stdIn.readLine());
			}
			aUniv.printAll();
		}
		System.exit(0);
	}
}

class Domi {
	private int bc = 4;
	private int fc = 3;
	private int rc = 10;
	private int[][][] psn = new int[bc][fc][rc];

	public void init() {
		for (int b = 0; b < bc; b++)
			for (int f = 0; f < fc; f++)
				for (int r = 0; r < rc; r++)
					psn[b][f][r] = 0;

	}

	public void printAll() {
		for (int b = 0; b < bc; b++) {
			if (b > 0)
				System.out.println("####################");
			for (int f = 0; f < fc; f++) {
				for (int r = 0; r < rc; r++)
					System.out.print(" " + psn[b][f][r]);
				System.out.println("");
			}
		}
	}

	public void moving(String log) {
		String[] logs = log.split(" ");
		int b = Integer.valueOf(logs[0]);
		int f = Integer.valueOf(logs[1]);
		int r = Integer.valueOf(logs[2]);
		int v = Integer.valueOf(logs[3]);
		psn[b - 1][f - 1][r - 1] += v;
	}

}