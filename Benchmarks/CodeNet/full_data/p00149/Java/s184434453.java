import java.io.IOException;

public class Main {
	/**
	* @param args
	*/
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	d = null;
		int[][]	t = new int[4][2];

		while((d = parseData()) != null) {
			for (int i = 0; i < d.length; i++) {
				if (11 <= d[i]) {
					t[0][i]++;
				} else if (6 <= d[i] && d[i] < 11){
					t[1][i]++;
				} else if (2 <= d[i] && d[i] < 6){
					t[2][i]++;
				} else {
					t[3][i]++;
				}
			}
		}

		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i][0]+" "+t[i][1]);
		}
	}

	private static int[] parseData() {
		// TODO Auto-generated method stub
		int[]	d = null;
		int		n = 0;

		if((n = parseNum()) != 0) {
			d    = new int[2];
			d[0] = n;
			d[1] = parseNum();
		}

		return d;
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = 0;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if ((skp == 0 || buf == -1) && buf != '.') {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}