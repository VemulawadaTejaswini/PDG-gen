/**
 * Country Road
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		int d = parseInt(br.readLine());
		for (int i = 0; i < d; i++) {
			line = br.readLine();
			int n = parseInt(line.substring(0, line.indexOf(' ')));
			int k = parseInt(line.substring(line.indexOf(' ') + 1));
			//
			line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			//
			int max = parseInt(line.substring(line.lastIndexOf(' ') + 1));
			int min = parseInt(st.nextToken());
			int maxLength = max - min;
			//
			int[] count = new int[max + 1];
			int[] distance = new int[n - 1];
			int next;
			while (st.hasMoreTokens()) {
				next = parseInt(st.nextToken());
				count[next - min]++;
				min = next;
			}
			for (int j = count.length - 1, l = distance.length - 1; l >= 0; j--) {
				if (count[j] > 0) {
					distance[l] = j;
					count[j]--;
					j++;
					l--;
				}
			}
			for (int j = distance.length - 1; k > 1 && j >= 0; j--) {
				maxLength -= distance[j];
				k--;
			}
			System.out.println(maxLength);
		}
	} //end main
}