import java.util.List;

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

		bubbleSort(values, n);

		stdIn.close();

	}

	public static void bubbleSort(List<Integer> values, int n) {

		int count = 0;

		for (int i = n; i > 1; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (values.get(j) > values.get(j + 1)) {
					values.add(j, values.get(j + 1));
//					System.out.println(values);
					values.remove(j + 2);
					count++;
				}
//				System.out.println(values);
//				System.out.println(count);
			}
		}
		StringBuilder output = new StringBuilder();
		for(int k = 0; k < values.size(); k++) {
			output.append(values.get(k) + " ");
		}
		System.out.println(output.delete(output.length()-1, output.length()));
		System.out.println(count);
	}
}
class Input {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int getValue() {
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}

	public List<Integer> getValueLines(int n) {
		List<Integer> values = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			values.add(getValue());
		}
		return values;
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