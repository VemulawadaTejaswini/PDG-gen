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
		List<Integer> r = stdIn.getValueLines(n);

		int maxv = r.get(1) - r.get(0);
		;
		int minv = r.get(0);

		//		System.out.println(n);
		//		System.out.println(r);

		for (int i = 0; i < n-1; i++) {
			if (maxv < r.get(i + 1) - minv) {
				maxv = r.get(i + 1) - minv;
			}
			if (minv > r.get(i + 1)) {
				minv = r.get(i + 1);
			}
//			System.out.println("j[" + (i + 1) + "]:" + r.get(i + 1) + " i[" + i + "]:" + r.get(i) + " maxv: " + maxv
//					+ "minv:" + minv);
		}
		System.out.println(maxv);

		stdIn.close();
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