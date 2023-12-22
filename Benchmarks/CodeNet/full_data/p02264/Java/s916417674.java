import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int q = sc.nextInt();
		Deque<Process> deque = new ArrayDeque<>();
		String s;
		int a;
		for (int i=0; i<n; i++) {
			s = sc.next();
			a = sc.nextInt();
			deque.addLast(new Process(s,a));
		}
		int time = 0;
		int temp;
		while (deque.size()!=0) {
			temp = Math.min(q,deque.getFirst().getTime());
			deque.getFirst().time -= temp;
			time += temp;
			if (deque.getFirst().getTime() > 0) {
				deque.addLast(deque.removeFirst());
			}
			else {out.println(deque.removeFirst().getName()+" "+time);}
		}
	}
}

class Process {
	String name;
	int time;
	public Process (String n, int t) {
		this.name = n;
		this.time = t;
	}
	public String getName () {
		return this.name;
	}
	public int getTime () {
		return this.time;
	}
}
