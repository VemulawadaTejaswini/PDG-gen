import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue();
		int n = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int cpuTime = sc.nextInt();
			Process p = new Process(name, cpuTime);
			queue.enqueue(p);
		}
		sc.close();

		int totalTime = 0;
		while (!queue.isEmpty()) {
			Process p = queue.dequeue();
			int time = Math.min(p.getCpuTime(), q);
			p.setCpuTime(p.getCpuTime() - time);
			totalTime += time;
			if (p.isFinished()) {
				System.out.println(p.getName() + " " + totalTime);
			} else {
				queue.enqueue(p);
			}
		}
	}
}

class Process {
	private String name;
	private int cpuTime;
	public Process(String name, int cpuTime) {
		this.name = name;
		this.cpuTime = cpuTime;
	}
	public String getName() {
		return name;
	}
	public int getCpuTime() {
		return cpuTime;
	}
	public void setCpuTime(int cpuTime) {
		this.cpuTime = cpuTime;
	}
	public boolean isFinished() {
		return this.cpuTime <= 0;
	}
}

class Queue {
	private LinkedList<Process> queue;
	public Queue() {
		queue = new LinkedList<Process>();
	}
	public void enqueue(Process p) {
		queue.addLast(p);
	}
	public Process dequeue() {
		Process ret = queue.getFirst();
		queue.removeFirst();
		return ret;
	}
	public boolean isEmpty() {
		return queue.size() <= 0;
	}
}