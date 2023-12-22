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
		int[][]	map = null;

		while((map = parseMap()) != null) {
			for (int y = 0; y < map.length; y++) {
				String	out = "";
				for (int x = 0; x < map.length; x++) {
					out += String.format("%5d", map[y][x]);
				}
				System.out.println(out);
			}
		}
	}

	private static int[][] parseMap() {
		int		len = parseCnt();
		int[][]	map = null;

		if (len > 0) {
			String	str = null;

			map = new int[len+1][len+1];
			for (int y = 0; y < len; y++) {
				if ((str = parseStdin()) != null) {
					String[]	lines = str.split(" ");
					for (int x = 0; x < len; x++) {
						map[y][x]      = Integer.parseInt(lines[x]);
						map[y][len]   += map[y][x];
						map[len][x]   += map[y][x];
						map[len][len] += map[y][x];
					}
				}
			}
		}
 
		return map;
	}

	private static int parseCnt() {
		int		cnt = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
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