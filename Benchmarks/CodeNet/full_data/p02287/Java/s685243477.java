/**
 * Heaps - Complete Binary Tree
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

		int h = parseInt(br.readLine());
		int[] heap = new int[h + 5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < h + 1; i++) {
			heap[i] = parseInt(st.nextToken());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < h + 1; i++) {
			sb.append(String.format("node %d: key = %d, ", i, heap[i]));
			if (i / 2 > 0) {
				sb.append(String.format("parent key = %d, ", heap[i / 2]));
			}
			if (i * 2 <= h) {
				sb.append(String.format("left key = %d, ", heap[i * 2]));
			}
			if (i * 2 + 1 <= h) {
				sb.append(String.format("right key = %d, ", heap[i * 2 + 1]));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	} //end main
}