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
		int[]			num = null;
		int				max = 0;
		Stack<int[]>	stk = new Stack<int[]>();

		while((num = parseNum()) != null) {
			max = Math.max(max, num[0]);
			stk.push(num);
		}

		if (stk.size() > 0) {
			long[][]	np = new long[max+2][100*max+1];

			np[0][0] = (long)1;
			for(int i = 0; i <= 100; i++){
				for(int j = max; j >= 0; j--){
					for(int k = 0;k + i <= 100*max; k++){
						np[j + 1][k + i] += np[j][k];
					}
				}
			}

			for (int i = 0; i < stk.size(); i++) {
				int[]	tmp = stk.get(i);
	            System.out.println(np[tmp[0]][tmp[1]]);
			}
		}
	}

	private static int[] parseNum() {
		int[]	param = null;
		String	strin = null;

		if ((strin = parseStdin()) != null) {
			String[]	lines = strin.split(" ");

			param    = new int[2];
			param[0] = Integer.parseInt(lines[0]);
			param[1] = Integer.parseInt(lines[1]);

			if (param[0] == 0 && param[1] == 0) {
				param = null;
			}
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