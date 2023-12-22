import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int M = 1046527;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());

			Long[] dict = new Long[M];

			for (int i = 0; i < n; i++) {
				String[] in = br.readLine().split(" ");
				Long val = replaceACGT(in[1]);
				doMethod(in[0], val, dict);

			}

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Long replaceACGT(String in) {
		long result = 0;
		int p = 1;
		for (char c : in.toCharArray()) {
			int now;

			switch (c) {
			case 'A':
				now = 1;
				break;
			case 'C':
				now = 2;
				break;
			case 'G':
				now = 3;
				break;
			case 'T':
				now = 4;
				break;
			default:
				now = 1;
				break;
			}

			result += p * now;
			p *= 5;
		}
		return result;
	}

	private static int h1(long key) { return (int)key % M; }
	private static int h2(long key) { return (int)(1 + (key % (M-1))); }

	private static void doMethod(String method, Long val, Long[] dict) {

		if(method.charAt(0) == 'i') {
			for (int i = 0; ; i++) {
				int h = ( h1(val) + i * h2(val) ) % M;
				if(dict[h] == null) {
					dict[h] = val;
					return;
				}
			}

		} else {
			for (int i = 0; ; i++) {
				int h = ( h1(val) + i * h2(val) ) % M;
				if(dict[h] == null) {
					System.out.println("no");
					return;
				} else if(dict[h].equals(val)) {
					System.out.println("yes");
					return;
				}
			}
		}
	}
}