import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		int n = Integer.valueOf(sn.nextLine());
		String[] ss = new String[n];
		for (int i = 0; i < n; i++) {
			char[] c = sn.nextLine().toCharArray();
			Arrays.sort(c);
			ss[i] = new String(c);
		}
		
		Arrays.sort(ss);

		System.out.println(calc(ss, 0, 1, 0));
	}
	
	private static long calc(String[] ss, int tempIndex, int addIndex, long cnt) {
		for (int i = tempIndex; i < ss.length; i++) {
			if (i + addIndex >= ss.length) {
				addIndex = 1;
				continue;
			}

			if (!ss[i].equals(ss[i + addIndex])) {
				addIndex = 1;
				continue;
			}
			
			return calc(ss, i, ++addIndex, ++cnt);
		}
		return cnt;
	}
}
