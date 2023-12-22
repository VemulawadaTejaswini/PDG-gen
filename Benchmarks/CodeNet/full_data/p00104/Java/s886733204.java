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
		int[][][]	map = null;

		while((map = parseMap()) != null) {
			int	x = 0;
			int	y = 0;
			while(true) {
				int[]	next = map[y][x];
				if (next == null) {
					System.out.println(x + " " + y);
					break;
				} else {
					if (next[2] == 1) {
						System.out.println("LOOP");
						break;
					} else {
						x = next[0];
						y = next[1];
						next[2] = 1;
					}
				}
			}
		}
	}

	private static int[] parseSize() {
		String	str  = null;
		int[]	size = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split(" ");
			if (!lines[0].equals("0") && !lines[1].equals("0")) {
				size    = new int[2];
				size[0] = Integer.parseInt(lines[0]);
				size[1] = Integer.parseInt(lines[1]);
			}
		}
 
		return size;
	}

	private static int[][][] parseMap() {
		int[][][]	map  = null;
		int[]		size = parseSize();

		if (size != null) {
			String	str = null;

			map = new int[size[0]][size[1]][];
			for (int y = 0; y < size[0]; y++) {
				if ((str = parseStdin()) != null) {
					for (int x = 0; x < size[1]; x++) {
						switch ((int)str.charAt(x)) {
						case	(int)'>':
							map[y][x]    = new int[3];
							map[y][x][0] = x+1;
							map[y][x][1] = y;
							break;
						case	(int)'<':
							map[y][x]    = new int[3];
							map[y][x][0] = x-1;
							map[y][x][1] = y;
							break;
						case	(int)'^':
							map[y][x]    = new int[3];
							map[y][x][0] = x;
							map[y][x][1] = y-1;
							break;
						case	(int)'v':
							map[y][x]    = new int[3];
							map[y][x][0] = x;
							map[y][x][1] = y+1;
							break;
						default:
							break;
						}
					}
				}
			}
		}
 
		return map;
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