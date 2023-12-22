import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short[][]	map = null;
		int			num = 0;

		while ((num = parseNum()) != 0) {
			map = new short[num][num];
			fill(map);
		}
	}

	private static void fill(short[][] map) {
		int		max = map.length * map.length;
		int[]	pos = { map.length / 2, map.length / 2 + 1};

		map[pos[1]][pos[0]] = 1;
		for (int n = 2; n <= max; n++) {
			pos[0] = (pos[0] + 1) % map.length;
			pos[1] = (pos[1] + 1) % map.length;
			if (map[pos[1]][pos[0]] != 0) {
				pos[0] = (pos[0] + map.length - 1) % map.length;
				pos[1] = (pos[1] + 1) % map.length;
			}
			map[pos[1]][pos[0]] = (short)n;
		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				System.out.printf("%4d", map[i][j]);
			}
			System.out.println("");
		}
	}

	private static int parseNum() {
		int		num   = 0;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			num = Integer.parseInt(strIn);
		}
		
		return num;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}