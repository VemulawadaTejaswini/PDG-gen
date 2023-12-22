import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		Input stdIn = new Input();

		int n = stdIn.getValue();
		List<Integer> values = stdIn.getLine();

		insertionSort(values, n);

		stdIn.close();
	}

	public static void insertionSort(List<Integer> values, int n) {
		StringBuilder sb2 = new StringBuilder();
		for(int k = 0; k < values.size();k++) {
			sb2.append(values.get(k) + " ");
		}
		System.out.println(sb2.delete(sb2.length()-1, sb2.length()));
		for (int i = 1; i < values.size(); i++) {
			StringBuilder sb = new StringBuilder();
			int v = values.get(i);
			int j = i - 1;
			for (; j >= 0 && values.get(j) > v; j--) {
			}
			values.remove(i);
			values.add(j+1, v);

			for(int k = 0; k < values.size();k++) {
				sb.append(values.get(k) + " ");
			}
			System.out.println(sb.delete(sb.length()-1, sb.length()));
		}
	}
}

class Input {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public Input() {
	}

	public int getValue() {
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}

	public List<Integer> getLine() {
		try {
			String[] s = br.readLine().trim().split(" ");
			List<Integer> ary = new ArrayList<>();
			for (int i = 0; i < s.length; i++) {
				ary.add(Integer.parseInt(s[i]));
			}
			return ary;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close() {
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}