import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void initiallize(char data[]) {
		for (int i = 0; i < data.length; ++i) {
			data[i] = '\0';
		}
	}

	public static void main(String[] args) {
		LinkedList<Character> stack = new LinkedList<Character>();
		char[] data = new char[10000];
		String str = "";
		int match;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				int k = 0;
				int tmp = k;
				initiallize(data);
				stack.clear();

				while (true) {
					int i;
					str = reader.readLine();
					for (i = 0; i < str.length(); ++i) {
						data[i + tmp] = str.charAt(i);
						++k;
					}
					tmp = k;
					if (data[tmp - 1] == '.') {
						break;
					}
				}

				if (data[0] == '.') {
					break;
				}
				match = -1;
				for (int i = 0; i < data.length; ++i) {
					if (data[i] == '(' || data[i] == '[') {
						stack.addFirst(data[i]);
						System.out.println(stack + " input");
					} else if (data[i] == ')') {
						System.out.println(stack + " right");
						if (stack.isEmpty()) {
							match = 0;
						} else {
							if (stack.getFirst() != '(') {
								match = 0;
							}
							stack.removeFirst();
						}
					} else if (data[i] == ']') {
						System.out.println(stack + " left");
						if (stack.isEmpty()) {
							match = 0;
						} else {
							if (stack.getFirst() != '[') {
								match = 0;
							}
							stack.removeFirst();
						}
					} else if (data[i] == '.') {
						if (stack.isEmpty()) {
							match = 1;
						} else {
							match = 0;
						}
					}
					if (match != -1) {
						break;
					}
				}
				if (match == 1) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		} catch (IOException ioe) {

		} finally {
			try {
				reader.close();
			} catch (IOException ie) {

			}
		}
	}
}

