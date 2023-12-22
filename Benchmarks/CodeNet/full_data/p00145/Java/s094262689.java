import java.io.IOException;
 
public class Main {
	/**
	* @param args
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		n = parseNum();
		int[][]	c = new int[n][2];
		int[][]	d = new int[n][n];

		// カードを取得
		for (int i = 0; i < n; i++) {
			c[i][0] = parseNum();
			c[i][1] = parseNum();
		}

		for (int l = 1; l < n; l++) {
			for (int i = 0; i+l < n; i++) {
				for (int j = i+l, k = i; k < j; k++) {
					int	t = d[i][k]+d[k+1][j]+c[i][0]*c[k][1]*c[k+1][0]*c[j][1];
					d[i][j] = (d[i][j] == 0)?t:Math.min(d[i][j], t);
				}
			}
		}

		System.out.println(d[0][n-1]);
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
				} else if (skp == 0) {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}