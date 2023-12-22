import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		int[][]	data = null;

		while((data = parseData()) != null) {
			int		size = data.length - 2;
			int		cnt  = 0;
			int[][]	t1   = data;
			int[][]	t2   = null;
			int[][]	c    = null;

			while (true) {
				boolean	fin = true;

				c  = new int[t1[size+1][0] - t1[size][0] + 1][1];
				t2 = new int[size+2][];

				t2[size]      = new int[1];
				t2[size+1]    = new int[1];
				t2[size][0]   = Integer.MAX_VALUE;
				t2[size+1][0] = Integer.MIN_VALUE;
				for (int l = 0; l < size; l++) {
					int	s = t1[l][0] - t1[size][0];
					c[s][0]++;
					t2[l]         = c[s];
					t2[size][0]   = Math.min(t2[size][0], t2[l][0]);
					t2[size+1][0] = Math.max(t2[size+1][0], t2[l][0]);
				}

				for (int l = 0; l < size && fin; l++) {
					fin = (t1[l][0] == t2[l][0]);
				}

				if (fin) {
					System.out.println(cnt);
					break;
				}

				t1 = t2;
				cnt++;
			}
		}
	}

	private static int parseNum() {
		int		num = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			num = Integer.parseInt(str);
		}

		return num;
	}

	private static int[][] parseData() {
		int[][]	data = null;
		int		size = parseNum();

		if (size > 0) {
			String	str = null;
			if ((str = parseStdin()) != null) {
				String[]	lines = str.split(" ");
				data = new int[size+2][1];
				data[size][0]   = Integer.MAX_VALUE;
				data[size+1][0] = Integer.MIN_VALUE;
				for (int l = 0; l < size; l++) {
					data[l][0]      = Integer.parseInt(lines[l]);
					data[size][0]   = Math.min(data[size][0], data[l][0]);
					data[size+1][0] = Math.max(data[size+1][0], data[l][0]);
				}
			}
		}
 
		return data;
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