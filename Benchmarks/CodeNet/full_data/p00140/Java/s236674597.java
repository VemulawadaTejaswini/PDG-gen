import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
	private static  BufferedReader  br = null;
	private	static	String			st = "012345678954321";
	private	static	int				sl = st.length();

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		while ((cnt = parseCnt()) != -1) {
			while (cnt-- > 0) {
				solve(parsePos());
			}
		}
	}

	private static void solve(int[]	pos) {
		int		pos1 = st.indexOf('0'+pos[0]);
		int		pos2 = st.indexOf('0'+pos[1]);
		String	out = "";

		if (pos[2] == 0) {
			for (int i = pos1; i <= pos2; i++) {
				out += (i == pos1) ? st.charAt(i) : " "+st.charAt(i);
			}
		} else {
			if (pos[3] < 6) {
				for (int i = pos1; i >= pos2; i--) {
					out += (i == pos1) ? st.charAt(i) : " "+st.charAt(i);
				}
			} else {
				int	pos3 = st.indexOf('0'+pos2, pos1);
				pos2 = (pos3 == -1) ? pos2 : pos3;
				for (int i = pos1; ; i = (i+1)%sl) {
					out += (i == pos1) ? st.charAt(i) : " "+st.charAt(i);
					if (i == pos2) break;
				}
			}
		}

		System.out.println(out);
	}

	private static int parseCnt() {
		int     cnt = -1;
		String  str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
	}

	private static int[] parsePos() {
		int[]	pos = null;
		String	str = null;
	
		if ((str = parseStdin()) != null) {
			str = str.replaceAll(" ", "");
			pos = new int[4];
			pos[0] = str.charAt(0) - '0';
			pos[1] = str.charAt(1) - '0';
			pos[2] = (pos[0] < pos[1]) ? 0 : 1;
			pos[3] = (pos[0] < pos[1]) ? pos[1] : pos[0];
		}
	
		return pos;
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			String	tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
				}
			}
		catch (IOException e) {}

		return stdin;
	}
}