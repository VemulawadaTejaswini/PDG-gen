import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		int[] go = new int[cs.length];
		for (int src = 0; src < cs.length; ++src) {
			int cur = src;
			for (int i = 0; i < 10; ++i) {
				cur = (cs[cur] == 'R' ? (cur + 1) : (cur - 1));
			}
			go[src] = cur;
		}
		int[] cnt=new int[cs.length];
		for(int i=0;i<cs.length;++i) {
			int cur=i;
			for(int j=0;j<100;++j) {
				cur=go[cur];
			}
			++cnt[cur];
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < cnt.length; ++i) {
			pw.print(cnt[i] + (i == cnt.length - 1 ? "\n" : " "));
		}
		pw.close();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}