import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();
		int K = sc.nextInt();

		List<String> ans = new LinkedList<>();
		for (int i = 0; i < K; i++) {
			ans.add("~" + i);
		}

		NEXTST: for (int st = 0; st < s.length(); st++) {
			NEXTED: for (int ed = st + 1; ed <= s.length(); ed++) {
				String a = s.substring(st, ed);
				for (int i = 0; i < K; i++) {
					int c = a.compareTo(ans.get(i));
					if (c < 0) {
						//小さい
						ans.add(i, a);
						ans.remove(ans.size() - 1);
						continue NEXTED;
					} else if (c > 0) {
						//おおきい
					} else { // c==0
						//次のedを調べる
						continue NEXTED;
					}
				}
				//これ以上このstを調べる必要ない
				continue NEXTST;
			}
		}

		out.println(ans.get(ans.size() - 1));

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
