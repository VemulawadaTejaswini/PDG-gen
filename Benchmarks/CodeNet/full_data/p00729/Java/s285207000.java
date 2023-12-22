import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class Log {
		int t, n, s;
		Log(int t, int n, int s) {
			this.t = t;
			this.n = n;
			this.s = s;
		}
	}
	
	void run() {
		int N, M, r, q;
		while (true) {
			N = sc.nextInt(); M = sc.nextInt();
			if (N == 0) break;
			boolean[][] students = new boolean[M][721];
			r = sc.nextInt();
			Map<Integer,List<Log>> log = new HashMap<Integer, List<Log>>();
			for (int i = 0; i < r; i++) {
				int t = sc.nextInt(), n = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
				if (log.containsKey(m)) {
					log.get(m).add(new Log(t,n,s));
				} else {
					List<Log> list = new ArrayList<Log>();
					list.add(new Log(t,n,s));
					log.put(m, list);
				}
			}
			
			for (int i = 1; i <= M; i++) {
				if (log.containsKey(i)) {
					List<Log> list = log.get(i);
					for (int j = 0; j < list.size()-1; j++) {
						if (list.get(j).s == 1) {
							int pc = list.get(j).n;
							for (int k = j+1; k < list.size(); k++) {
								if (list.get(k).n == pc) {
									for (int l = list.get(j).t; l <= list.get(k).t; l++) {
										students[i-1][l-540] = true;
									}
									break;
								}
							}
						}
					}
				}
			}
			
			q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int ts = sc.nextInt(), te = sc.nextInt(), m = sc.nextInt();
				int count = 0;
				boolean f = false;
				for (int j = ts; j <= te; j++) {
					if (students[m-1][j-540]){
						if (f)
							count++;
						else
							f = true;
					} else {
						f = false;
					}
				}
				out.println(count);
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}