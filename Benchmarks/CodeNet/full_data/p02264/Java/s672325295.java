
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class NameTime {
		String name;
		int time;
		
	}
	
	public static void queue1(Queue<NameTime> q, int t) {
		int time = 0;
		while (!q.isEmpty()) {
			NameTime nt = q.remove();
			if (nt.time > t) {
				time += t;
				nt.time -= t;
				q.add(nt);
			}
			else {
				time += nt.time;
				System.out.println(nt.name + " " + time);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Queue<NameTime> q = new LinkedList<>();
		int n = scan.nextInt();
		int t = scan.nextInt();
		
		for (int i = 0; i < n; ++i) {
			NameTime nt = new NameTime();
			nt.name = scan.next();
			nt.time = scan.nextInt();
			q.add(nt);
		}
		queue1(q, t);
		
	}
}

