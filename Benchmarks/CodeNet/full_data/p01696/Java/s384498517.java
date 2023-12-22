/**
 * Broken Cipher Generator
 */

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

			Deque<Character> rev = new ArrayDeque<Character>(); //stack
			Deque<Character> tmp = new ArrayDeque<Character>(); //queue
			int shift = 0;

			for (char c : line.toCharArray()) {
				switch (c) {
					case '[':
						tmp.push(c);
						break;
					case ']':
						char d = tmp.pop();
						while (d != '[') {
							rev.push(d);
							d = tmp.pop();
						}
						// reverse
						while (!rev.isEmpty()) {
							tmp.offer(rev.pop());
						}
						break;
					case '+':
						shift++;
						break;
					case '-':
						shift--;
						break;
					case '?':
						tmp.push('A');
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
							tmp.push((char) c);
							shift = 0;
						} else {
							tmp.push(c);
						}
						break;
				}
			}
			while (!tmp.isEmpty()) {
				rev.push(tmp.pop());
			}
			StringBuilder sb = new StringBuilder();
			while (!rev.isEmpty()) {
				sb.append(rev.pop());
			}
			System.out.println(sb.toString());
		}
	} //end while
} //end main