import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>	s = new Stack<Integer>();

		boolean	map[] = new boolean[3001];

		for (int n = 0; n <= map.length; n += 4) {
			map[n] = (n % 400 == 0 || n % 4 == 0 && n % 100 != 0);
		}

		while(true) {
			int[]	r = parseRange();
			int		n = 0;
			boolean	f = false;

			if (r[0] == 0 && r[1] == 0) {
				break;
			}

			n = r[0] / 4;
			n = (r[0] % 4 != 0) ? n + 1 : n;
			n = n * 4;

			if (s.size() > 0) {
				s.push(-2);
			}

			for (; n <= r[1]; n += 4) {
				if (map[n]) {
					s.push(n);
					f = true;
				}
			}

			if (!f) {
				s.push(-1);
			}
		}

		for (int l = 0; l < s.size(); l++) {
			int	n = s.get(l);
			if (n == -2) {
				System.out.println("");
			} else if (n == -1) {
				System.out.println("NA");
			} else {
				System.out.println(n);
			}
		}
	}

	private static int[] parseRange() {
		int[]	params = new int[2];
		String	strin  = null;

		if ((strin = parseStdin()) != null) {
			String[]	lines = strin.split(" ");
			params[0] = Integer.parseInt(lines[0]);
			params[1] = Integer.parseInt(lines[1]);
		}
 
		return params;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (!tmp.isEmpty()) stdin = tmp;
        }
        catch (IOException e) {}
 
        return stdin;
	}
}