import java.util.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	int count = 0;

	public static void main(String[] args) {

		InputOutput stdIO = new InputOutput();

		int n = stdIO.getValue();
		List<Integer> values = stdIO.getLine();

		Main my = new Main();

		my.selectionSort(values, n);
		stdIO.outputLine(values);
		System.out.println(my.count);

		stdIO.close();
	}

	private void selectionSort(List<Integer> values, int n) {

		for (int i = 0; i < n - 1; i++) {
			int minj = values.get(i);
			int minindex = 0;
			for (int j = i; j < n; j++) {
				if (minj > values.get(j)) {
					minj = values.get(j);
					minindex = j;
				}
			}
			if(values.get(i) > minj) {
			values.set(minindex, values.get(i));
//			System.out.println(values);
			values.set(i, minj);
//			System.out.println(values);
			count++;
			}
//			System.out.println(count);
		}
	}
}

class InputOutput {
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

	public void outputLine(List<Integer> values) {
		StringBuilder line = new StringBuilder();
		for(int k = 0; k < values.size(); k++) {
			line.append(values.get(k) + " ");
		}
		System.out.println(line.delete(line.length()-1, line.length()));
	}
}