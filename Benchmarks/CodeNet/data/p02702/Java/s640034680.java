import java.util.*;

public class Main {

	static final int r = 2019;

	public static int judge(String t) {
		// System.out.println(t + " //");
		int n = t.length();
		long cur = 0, num = 0;
		for (int i = 0; i < n; ++i) {
			// System.out.println(num + " " + i);
			num = cur * 10 + (int)(t.charAt(i) - '0');
			// System.out.println(num + " " + cur);
			cur = (num % r);
		}
		// System.out.println("//");
		return (int) cur;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		long ans = 0;
		int n = s.length();
		for (int i = 0; i < n; ++i) {
			StringBuffer tmp = new StringBuffer();
			char t = s.charAt(i);
			for (int j = i; j < n; ++j) {
				if(t == '0' && j == i)continue;
				tmp.append(s.charAt(j));
				int curr = judge(tmp.toString());
				// System.out.println(tmp + " " + j + " " + i + " " + curr);
				if (curr == 0){
					ans++;
					// System.out.println(j + " " + i);
				}
				tmp.delete(0, tmp.length());
				tmp.append(String.valueOf(curr));
				// System.out.println(tmp + " " + j + " " + i + " " + curr);
			}
		}
		System.out.println(ans);
	}
}
