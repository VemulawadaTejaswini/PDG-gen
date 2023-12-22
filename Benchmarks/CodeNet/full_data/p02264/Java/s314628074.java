import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int N,Q,now;
	private List<Process> L;
	private Deque<Process> queue;

	public void mainrun() {
		scan = new Scanner(System.in);
		L = new ArrayList<>();
		queue = new LinkedList<>();

		N = scan.nextInt();
		Q = scan.nextInt();
		now = 0;

		for(int i = 0;i < N;i++) {
			queue.add(new Process(scan.next(),scan.nextInt()));
		}

		while(!queue.isEmpty()) {
			looprun();
		}

		L.forEach(e->e.print());

		scan.close();

	}

	private void looprun() {
		Process p = queue.pop();
		if(p.getTime() <= Q) {
			now += p.getTime();
			p.setTotalTime(now);
			L.add(p);
		}else {
			now += Q;
			p.minusTime(Q);
			queue.add(p);
		}
	}
}

class Process{
	private String id;
	private int time,totalTime;

	public Process(String id,int time) {
		setId(id);
		setTime(time);
		setTotalTime(0);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void minusTime(int mtime) {
		time -= mtime;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}

	public void print() {
		System.out.println(id + " " + Integer.toString(totalTime));
	}

}
