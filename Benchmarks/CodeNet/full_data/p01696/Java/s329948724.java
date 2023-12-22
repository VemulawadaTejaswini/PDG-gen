import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			if (line.equals(".")) break;

			Deque<Character> rev = new ArrayDeque<Character>();
			Deque<Character> out = new ArrayDeque<Character>();
			int shift = 0;

			for (char c : line.toCharArray()) {
				switch (c) {
					case '[':
						out.offer(c);
						break;
					case ']':
						char d = out.removeLast();
						while (d != '[') {
							rev.push(d);
							d = out.removeLast();
						}
						// reverse
						while (!rev.isEmpty()) {
							out.offer(rev.removeLast());
						}
						break;
					case '+':
						shift++;
						break;
					case '-':
						shift--;
						break;
					case '?':
						out.offer('A');
						shift = 0;
						break;
					default:
						if (shift != 0) {
							shift %= 26;
							c += shift;
							if (c < 'A') {
								c += 26;
							} else if (c > 'Z') {
								c -= 26;
							}
							out.offer((char) c);
							shift = 0;
						} else {
							out.offer(c);
						}
						break;
				}
			}
			StringBuilder sb = new StringBuilder();
			while (!out.isEmpty()) {
				sb.append(out.poll());
			}
			System.out.println(sb.toString());
		}
	} //end while
} //end main