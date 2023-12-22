import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Student[] students;
		while (stdin.hasNext()) {
			int N = stdin.nextInt();
			int M = stdin.nextInt();
			if (N == 0 && M == 0) break;
			students = new Student[M];
			for (int i = 0; i < M; i++) {
				students[i] = new Student();
			}
			int r = stdin.nextInt();
			for (int i = 0; i < r; i++) {
				int t = stdin.nextInt();
				int n = stdin.nextInt();
				int m = stdin.nextInt();
				boolean s = stdin.nextInt() == 1;
				students[m-1].switchPC(t, s);
			}
			int q = stdin.nextInt();
			for (int i = 0; i < q; i++) {
				int ts = stdin.nextInt();
				int te = stdin.nextInt();
				int m = stdin.nextInt();
				System.out.println(students[m-1].totalTime(ts, te));
			}
		}
		System.exit(0);
	}
}

class Student {
	private List<Integer> logtime = new ArrayList<Integer>();
	private int login = 0;
	public void switchPC(int t, boolean s) {
		if (s) {
			if (login++ == 0) {
				logtime.add(t);
			}
		}
		else {
			if (--login == 0) {
				logtime.add(t);
			}
		}
	}
	public int totalTime(int ts, int te) {
		int sum = 0;
		Iterator it = logtime.iterator();
		while (it.hasNext()) {
			int tin = Integer.parseInt(it.next().toString());
			int tout = Integer.parseInt(it.next().toString());
			if (tout < ts) continue;
			if (tin > te) break;
			if (tin < ts) tin = ts;
			if (tout > te) tout = te;
			sum += tout - tin;
		}
		return sum;
	}
	private boolean isLogedInAt(int time) {
		for (int i = 0; i < logtime.size(); i++) {
			if (logtime.get(i) > time) return i % 2 != 0;
		}
		return false;
	}
}