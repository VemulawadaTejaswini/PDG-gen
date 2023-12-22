
import java.io.*;
import java.util.*;

public class Main {

	char[] crypt;
	String line;
	public void solve() {
		while ((line = next()).charAt(0) != '#') {
			crypt = line.toCharArray();
			HashSet<String> answer = new HashSet<>();
			//recur(crypt, new boolean[26], 0, answer);
			r2(crypt, 0, answer);
			out.println(answer.size());
			ArrayList<String> list = new ArrayList<>(answer);
			Collections.sort(list);
			for (int i = 0; i < Math.min(list.size(), 5); i++) {
				out.println(list.get(i));
			}
			for (int i = Math.max(list.size() - 5, 5); i < list.size(); i++) {
				out.println(list.get(i));
			}
		}
	}

	public void r2(char[] crypt, int idx, Set<String> set) {
		if (idx == crypt.length) {
			if(check(crypt)){
				set.add(new String(crypt));
				
			}
			return;
		}
		r2(crypt, idx + 1, set);
		if(crypt[idx] < 'z'){
			crypt[idx] ++;
			r2(crypt, idx + 1, set);
			crypt[idx] --;
		}
	}

	public boolean check(char[] crypt) {
		char[] array = Arrays.copyOf(crypt, crypt.length);
		
		for(int i = 'b'; i <= 'z'; i++){
			for(int j = 0; j < array.length; j++){
				if(array[j] == i){
					array[j]--;
					break;
				}
			}
		}
		return line.equals(new String(array));
	}

	public void recur(char[] crypt, boolean[] used, int idx, Set<String> set) {
		if (idx >= crypt.length) {
			set.add(new String(crypt));
			return;
		} else {
			int v = crypt[idx] - 'a';
			if (v < ('z' - 'a') && !used[v]) {
				used[v] = true;
				crypt[idx] += 1;
				recur(crypt, used, idx + 1, set);
				crypt[idx] -= 1;
				used[v] = false;

				if (v == 0 || used[v - 1]) {
					recur(crypt, used, idx + 1, set);
				}
			} else if (v == ('z' - 'a')) {
				if (used['y' - 'a']) {
					recur(crypt, used, idx + 1, set);
				}
			} else {
				recur(crypt, used, idx + 1, set);
			}
		}
	}

	private static PrintWriter out;

	public static void main(String[] args) {
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}

	public static int nextInt() {
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}

	public static long nextLong() {
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if (str.charAt(0) == '-') {
			minus = true;
			i++;
		}
		int len = str.length();
		for (; i < len; i++) {
			char c = str.charAt(i);
			if (!('0' <= c && c <= '9'))
				throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}

	public static String next() {
		int c;
		while (!isAlNum(c = read())) {
		}
		StringBuilder build = new StringBuilder();
		build.append((char) c);
		while (isAlNum(c = read())) {
			build.append((char) c);
		}
		return build.toString();
	}

	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;

	private static int read() {
		if (bufferLength < 0)
			throw new RuntimeException();
		if (bufferIndex >= bufferLength) {
			try {
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufferLength <= 0)
				return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}

	private static boolean isAlNum(int c) {
		return '!' <= c && c <= '~';
	}
}