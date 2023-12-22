import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	private int cnt;
	private int M;
	private List<Integer> arrayG = new ArrayList<>();
	private static final Main my = new Main();

	public static void main(String[] args) {
		//input
		InputOutput stdIO = new InputOutput();
		int n = stdIO.getValue();
		List<Integer> arrayA = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arrayA.add(stdIO.getValue());
		}
		//sort
		my.shellSort(arrayA, n);

		//output
		System.out.println(/*"M:" + */my.M);
//		System.out.print("G[]: ");
		stdIO.<Integer> outputLine(my.arrayG);
		System.out.println(/*"cnt:" + */my.cnt);
		stdIO.outputLines(arrayA);

		//terminate
		stdIO.close();
	}

	private void shellSort(List<Integer> arrayA, int n) {
		cnt = 0;
		for (int i = 1; ((Math.pow(3, i) - 1) / 2) <= n; i++) {
			arrayG.add(0, (int) ((Math.pow(3, i) - 1) / 2));
		}
		M = arrayG.size();

		for (int i = 0; i < my.M; i++) {
//			System.out.println("insertionSort:g:" + arrayG.get(i));
			my.insertionSort(arrayA, n, arrayG.get(i));
		}
	}

	private void insertionSort(List<Integer> values, int n, int g) {

		for (int i = g; i < n; i++) {
			int v = values.get(i);
			int j = i - g;
//			System.out.println("i:" + i + " " + "j" + j);
			while (j >= 0 && values.get(j) > v) {
				values.set(j+g, values.get(j));
				values.set(j, v);
				j = j - g;
				cnt++;
//				System.out.println(values);
			}
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
		for (int i = 0; i < n; i++) {
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

	public List<String> getLineString() {
		try {
			String[] s = br.readLine().trim().split(" ");
			List<String> ary = Arrays.asList(s);
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

	public <E> void outputLine(List<E> values) {
		StringBuilder line = new StringBuilder();
		for (int k = 0; k < values.size(); k++) {
			line.append(values.get(k) + " ");
		}
		System.out.println(line.delete(line.length() - 1, line.length()));
	}
	public <E> void outputLines(List<E> values) {
		for (E e : values) {
			System.out.println(e);
		}
	}
}