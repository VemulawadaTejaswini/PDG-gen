import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
 
public class Main {
	private static  BufferedReader  br = null;
	private	static	String			st = "0123456789543210";

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
		int		pos3 = st.indexOf('0'+pos[0], pos2);
		String	out = "";

		if (pos3 == -1 || (pos3 != -1 && (pos2 - pos1 <= pos3 -pos2))) {
			if (pos[2] == 0) {
				for (int i = pos1; i <= pos2; i++) {
					out += (i == pos1) ? st.charAt(i) : " "+st.charAt(i);
				}
			} else {
				for (int i = pos2; i >= pos1; i--) {
					out += (i == pos2) ? st.charAt(i) : " "+st.charAt(i);
				}
			}
		} else {
			if (pos[2] == 0) {
				for (int i = pos3; i >= pos2; i--) {
					out += (i == pos3) ? st.charAt(i) : " "+st.charAt(i);
				}
			} else {
				for (int i = pos2; i <= pos3; i++) {
					out += (i == pos2) ? st.charAt(i) : " "+st.charAt(i);
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
			pos = new int[3];
			pos[0] = str.charAt(0) - '0';
			pos[1] = str.charAt(1) - '0';

			if (pos[0] > pos[1]) {
				int	tmp = pos[0];
				pos[0] = pos[1];
				pos[1] = tmp;
				pos[2] = 1;
			}
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