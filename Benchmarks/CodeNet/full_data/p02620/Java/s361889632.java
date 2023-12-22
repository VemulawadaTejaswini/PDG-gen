import java.util.*;
public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int INF = Integer.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int[] c = new int[26];
		Arrays.setAll(c, i -> sc.nextInt());
		int[][] s = new int[D][26];
		for(int i = 0; i < D; i++)
			Arrays.setAll(s[i], x -> sc.nextInt());
		int[] con = new int[D];
		TreeSet<Integer>[] used = new TreeSet[26];
		for(int i = 0; i < 26; i++) {
			used[i] = new TreeSet<>();
			used[i].add(-1);
		}
		int sat = 0;
		for(int d = 0; d < D; d++) {
			int max = -INF, now = 0;
			for(int i = 0; i < 26; i++) {
				int temp = 0;
				temp += s[d][i];
				for(int j = 0; j < 26; j++)
					if(i != j)
						temp -= c[j] * (d - used[j].last());
				if(max < temp) {
					max = temp;
					now = i;
				}
			}
			con[d] = now;
			used[now].add(d);
			sat += max;
		}
		for(int i = 0; i < 26; i++)
			used[i].add(D);
		Random r = new Random();
		while(System.currentTimeMillis() - start < 1950) {
			int temp = 0;
			int d = r.nextInt(D);
			int q = r.nextInt(26);
			temp -= s[d][con[d]];
			temp += s[d][q];
			temp -= c[con[d]] * (used[con[d]].ceiling(d) - d) * (d - used[con[d]].lower(d));
			temp += c[q] * (d - used[q].lower(d)) * (used[q].ceiling(d) - d);
			if(temp > 0) {
				sat += temp;
				con[d] = q;
				used[con[d]].remove(d);
				used[q].add(d);
			}
		}
		for(int i : con)
			System.out.println(i + 1);
	}

}