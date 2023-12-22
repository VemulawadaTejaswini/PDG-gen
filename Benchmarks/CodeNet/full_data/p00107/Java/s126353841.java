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
		int[]	cheese = null;

		while((cheese = parseCheese()) != null) {
			int	cnt = parseNum();
			while (cnt-- > 0) {
				int	size = parseNum();
				if (size >= cheese[0] || size >= cheese[1] || size >= cheese[2]) {
					System.out.println("OK");
				} else {
					System.out.println("NA");
				}
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

	private static int[] parseCheese() {
		String	str    = null;
		int[]	cheese = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split(" ");

			if (lines.length == 3) {
				if (!lines[0].equals("0") || !lines[1].equals("0") || !lines[2].equals("0")) {
					cheese    = new int[3];
					cheese[0] = Integer.parseInt(lines[0]);
					cheese[1] = Integer.parseInt(lines[1]);
					cheese[2] = Integer.parseInt(lines[2]);
				}
			}
		}
 
		return cheese;
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