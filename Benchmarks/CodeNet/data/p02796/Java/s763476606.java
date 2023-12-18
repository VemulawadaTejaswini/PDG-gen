import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Arm> a = new ArrayList<Arm>();

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			int left = Integer.parseInt(str[0]) - Integer.parseInt(str[1]);
			int right = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
			a.add(new Arm(left, right));
		}

		Collections.sort(a);
		long cur = Long.MIN_VALUE;
		int ans = 0;

		for (int i = 0; i < a.size(); i++) {
			if (cur > a.get(i).left) {
				continue;
			}
			ans++;
			cur = a.get(i).right;
		}

		System.out.println(ans);
	}
}

class Arm implements Comparable<Arm> {
	int left;
	int right;

	public Arm(int left, int right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int compareTo(Arm a) {
		return this.right - a.right;
	}
}
