import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		Input[] in = new Input[n];
		for (int i = 0; i < n; i++) {
			in[i] = new Input(sc.nextInt(), sc.nextLong());
		}
		Arrays.sort(in, new Comparator<Input>() {
		public int compare(Input t1, Input t2) {
			return t1.val - t2.val;
		}
		});
		long total = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			total += in[i].count;
			if (total >= k) {
				ans = in[i].val;
				break;
			}
		}
		System.out.println(ans);
	}
	
	static class Input {
		int val;
		long count;
		public Input(int val, long count) {
			this.val = val;
			this.count = count;
		}
	}
}
