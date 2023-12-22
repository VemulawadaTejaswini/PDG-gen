import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = 0, q = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			n = scanner.nextInt();
			q = scanner.nextInt();
		} catch (Exception e) {
		}
		ArrayList<Queue> qu = new ArrayList<Queue>();
		for (int i = 0; i < n; i++) {
			try {
				String name = scanner.next();
				int time = scanner.nextInt();
				qu.add(new Queue(name, time));
			} catch (Exception e) {
			}
		}

		int i = 0, count = 0, alltime = 0;
		while (qu.size() > 0) {
			i = i % qu.size();
			int t = qu.get(i).time;
			if (t <= q) {
				alltime += t;
				System.out.println(qu.get(i).name + " " + alltime);
				qu.remove(i);
				i--;
			} else {
				alltime += q;
				qu.get(i).time -= q;
			}
			i++;
		}

	}
}


class Queue {
	String name;
	int time;

	public Queue(String n, int t) {
		name = n;
		time = t;
	}
}