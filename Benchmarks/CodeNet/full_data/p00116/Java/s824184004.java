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
		int[][] map = null;

		while((map = parseMap()) != null) {
			System.out.println(calcMaxSum(map));
		}
	}

	private static int calcMaxSum(int[][] map) {
		int	max = 0;

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				int	l = map[i][j];
				if (l * (map.length-i) > max) {
					for (int k = 0; i+k < map.length; k++) {
						l = Math.min(l, map[i+k][j]);
						if (l * (map.length-i) <= max) {
							// 理論上、これ以上最大値を更新できない場合は計算しない
							break;
						} else {
							max = Math.max(max, l * (k+1));
						}
					}
				}
			}
		}

        return max;
	}

	private static int[][] parseMap() {
		int[][]	map = null;
		int[]	len = parseLen();

        if (len != null) {
			map = new int[len[0]][len[1]];

			for (int y = 0; y < len[0]; y++) {
				String	strin = null;
		        if ((strin = parseStdin()) != null) {
		        	for (int x = len[1]-1; x >= 0; x--) {
		        		if (strin.charAt(x) == (char)'.') {
		        			map[y][x] = (x < len[1]-1) ? ((map[y][x+1] != 0) ? map[y][x+1]+1 : 1) : 1;
		        		}
		        	}
		        }
			}
        }
 
        return map;
	}

	private static int[] parseLen() {
		int[]	params = null;
        String	stdin  = null;

        if ((stdin = parseStdin()) != null) {
			if (!stdin.equals("0 0")) {
				String[]	lines = stdin.split(" ");

				params    = new int[2]; 
				params[0] = Integer.parseInt(lines[0]);
				params[1] = Integer.parseInt(lines[1]);
			}
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