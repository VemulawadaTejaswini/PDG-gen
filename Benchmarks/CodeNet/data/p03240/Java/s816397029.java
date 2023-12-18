import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*Atcoder用
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		int a = Integer.parseInt(tmp[0]);
		int b = Integer.parseInt(tmp[1]);
		int c = Integer.parseInt(tmp[2]);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String get = br.readLine();
		char[] s = get.toCharArray();
		for(char c:s)System.out.println(c);

		List<Integer> ls = new ArrayList<Integer>();
		String[] tmp = br.readLine().split(" ");
		for (int n = 0; n < N; n++) {
			ls.add(Integer.parseInt(tmp[n]));
		}
 */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		int N = Integer.parseInt(inp);

		List<Integer> xls = new ArrayList<Integer>();
		List<Integer> yls = new ArrayList<Integer>();
		List<Integer> hls = new ArrayList<Integer>();

		for (int n = 0; n < N; n++) {
			String[] tmp = br.readLine().split(" ");
			xls.add(Integer.parseInt(tmp[0]));
			yls.add(Integer.parseInt(tmp[1]));
			hls.add(Integer.parseInt(tmp[2]));
		}

		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				int height = Math.abs(x - xls.get(0)) + Math.abs(y - yls.get(0)) + hls.get(0);
				boolean isCorrect = true;
				for (int i = 1; i < xls.size(); i++) {
					if (height != Math.abs(x - xls.get(i)) + Math.abs(y - yls.get(i)) + hls.get(i)) {
						isCorrect = false;
					}
				}
				if(isCorrect){
					System.out.println(x + " " + y + " " + height);
					System.exit(0);
				}
			}
		}

	}

}