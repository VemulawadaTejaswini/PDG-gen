import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	private void run() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		reader.close();
		
		int totalArea = 0;
		Stack<Integer> st1 = new Stack<Integer>();
		Stack<int[]> st2 = new Stack<int[]>();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '\\') {
				st1.push(i);
			} else if (c == '/') {
				int area = 0;
				int pos = 0;
				if (!st1.isEmpty()) {
					pos = st1.pop();
					area = i - pos;
					totalArea += area;
					while (!st2.isEmpty() && st2.peek()[0] > pos) {
						area += st2.pop()[1];
					}
					st2.push(new int[] {pos, area});
				}
			}
		}
		
		System.out.println(totalArea);
		System.out.print(st2.size());
		StringBuilder sb = new StringBuilder();
		while (!st2.isEmpty()) {
			sb.insert(0, st2.pop()[1]);
			sb.insert(0, " ");
		}
		System.out.println(sb.toString());
	}
}
