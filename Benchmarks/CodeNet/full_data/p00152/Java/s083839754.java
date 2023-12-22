import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	/**
	 * @param args
	 */

	static class Cmp implements Comparator<Integer> {
		 
	    /** ソート対象のカラムの位置 */
	    public int compare( Integer n1, Integer n2 ) {
	    	int	st = (n2/10000) - (n1/10000);
	    	if (st == 0) {
	    		st = (n1%10000) - (n2%10000);
	    	}
	        return st;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int			n = 0;
		Integer[]	t = new Integer[40];

		while((n = parseNum()) != 0) {
			for (int i = 0; i < n; i++) {
				t[i] = score();
			}

			Arrays.sort(t, 0, n, new Cmp());

			for (int i = 0; i < n; i++) {
				System.out.println((t[i]%10000)+" "+(t[i]/10000));
			}
		}
	}

	private static int score() {
		int		sno = parseNum();
		int		sum = 0;
		int[]	inp = new int[21+1];
		int[]	scr = new int[21];

		for (int i = 0, cnt = 1; i < 10; i++) {
			inp[cnt]   = parseNum();
			scr[i*2+0] = cnt++;

			if (i < 9) {
				if (inp[scr[i*2+0]] == 10) continue;
				inp[cnt]   = parseNum();
				scr[i*2+1] = cnt++;
			} else {
				if (inp[scr[i*2+0]] == 10) {
					inp[cnt]   = parseNum();
					scr[i*2+1] = cnt++;
					inp[cnt]   = parseNum();
					scr[i*2+2] = cnt++;
				} else {
					inp[cnt]   = parseNum();
					scr[i*2+1] = cnt++;
					if (inp[scr[i*2+0]] + inp[scr[i*2+1]] == 10) {
						inp[cnt]   = parseNum();
						scr[i*2+2] = cnt++;
					}
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			int	tmp = 0;

			if (i < 9) {
				if (inp[scr[i*2+0]] == 10) {
					tmp += inp[scr[i*2+0]] + inp[scr[i*2+0]+1] + inp[scr[i*2+0]+2];
				} else if (inp[scr[i*2+0]] + inp[scr[i*2+1]] == 10) {
					tmp += inp[scr[i*2+0]] + inp[scr[i*2+1]] + inp[scr[i*2+1]+1];
				} else {
					tmp += inp[scr[i*2+0]] + inp[scr[i*2+1]];
				}
			} else {
				tmp += inp[scr[i*2+0]] + inp[scr[i*2+1]] + inp[scr[i*2+2]];
			}

			sum += tmp;
		}

		return sum*10000+sno;
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