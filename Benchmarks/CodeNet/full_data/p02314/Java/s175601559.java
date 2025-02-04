import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {

		final int INF = Integer.MAX_VALUE/2;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int n = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		int m = Integer.parseInt(line.substring(line.indexOf(" ")+1));

		line = br.readLine();
		String[] str = line.split(" ");
		int[] d = new int[m];
		for (int i=0; i<m; i++) {
			d[i] = Integer.parseInt(str[i]);
		}

		Arrays.sort(d);
		int count = 0;

		for (int i=m-1; i>=0; i--) {
			if (n-d[i] >= 0) {
				count += n/d[i];
				n %= d[i];
			}
		}

		System.out.println(count);

		br.close();
	}
}