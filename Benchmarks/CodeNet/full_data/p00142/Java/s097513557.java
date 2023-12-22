import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	BufferedReader	br = null;

	static class Table extends ArrayList<Integer> {}

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		num = 0;
		int		max = 0;
		int		siz = 0;
		Table	inp = new Table();
		int[]	tbl = null;

		while((num = parseNum()) != 0) {
			max = Math.max(max, num);
			inp.add(num);
		}

		tbl = new int[max];
		for (int i = 1; i < max; i++) {
			tbl[i] = (i*i);
		}

		siz = inp.size();
		for (int i = 0; i < siz; i++) {
			solve(inp.get(i), tbl);
		}
	}

	private static void solve(int num, int[] tbl) {
		int		tmp = 0;
		int		siz = 0;
		int		lim = (num-1)/2;
		Table	sub = new Table();
		int[]	cnt = new int[lim+1];

		for (int i = 1; i < num; i++) {
			tmp = tbl[i]%num;
			if (!sub.contains(tmp)) {
				sub.add(tmp);
			}
		}

		siz = sub.size();
		for (int i = 0; i < siz; i++) {
			for (int j = 0; j < siz; j++) {
				if (i!=j) {
					tmp = sub.get(j)-sub.get(i);
					if (tmp < 0) tmp = tmp+num;
					if (tmp > lim) tmp = num-tmp;
					cnt[tmp]++;
				}
			}
		}

		for (int i = 1; i <= lim; i++) {
			System.out.println(cnt[i]);
		}
	}

	private static int parseNum() {
		int		param = 0;
		String	strin = null;

		if ((strin = parseStdin()) != null) {
			param = Integer.parseInt(strin);
		}
 
		return param;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) {
            		stdin = tmp;
            	}
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}