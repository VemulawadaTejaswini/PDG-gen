import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n = 0, q = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			n = scanner.nextInt();
			q = scanner.nextInt();
		} catch (Exception e) {
		}
		Queue[] qu = new Queue[n];
		for (int i = 0; i < n; i++) {
			try {
				String name = scanner.next();
				int time = scanner.nextInt();
				qu[i] = new Queue(name, time);
			} catch (Exception e) {
			}
		}

		int i = 0, count = 0, alltime = 0;
		while (count < n) {
			i = i % n;
			if (qu[i].time > 0) {
				if (qu[i].time <= q) {
					alltime += qu[i].time;
					count++;
					qu[i].time = 0;
					System.out.println(qu[i].name + " " + alltime);
				} else {
					alltime += q;
					qu[i].time -= q;
				}
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