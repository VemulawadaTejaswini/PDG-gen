import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static class Process {
		private String name;
		private int time;

		public Process(String name, int time) {
			this.name = name;
			this.time = time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public String getName() {
			return this.name;
		}

		public int getTime() {
			return this.time;
		}
	}

	public static class Queue {
		private Process[] data;
		private int head;
		private int tail;
		private int max;

		public Queue (int processNum) {
			this.data = new Process[processNum + 1];
			this.head = 0;
			this.tail = 0;
			this.max = processNum + 1;
		}

		public void enqueue(Process process) {
			this.data[this.tail] = process;
			if(this.tail + 1 == this.max) {
				this.tail = 0;
			} else {
				this.tail++;
			}
		}

		public Process dequeue() {
			Process process = this.data[this.head];
			if(this.head + 1 == this.max) {
				this.head = 0;
			} else {
				this.head++;
			}
			return process;
		}

		public boolean isEmpty() {
			if(this.tail == this.head) {
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] premise = br.readLine().split(" ");

		int processNum =Integer.parseInt(premise[0]);

		Queue queue = new Queue(processNum);

		int q = Integer.parseInt(premise[1]);

		for(int i = 0; i < processNum; i++) {
			String[] processString = br.readLine().split(" ");
			Process process = new Process(processString[0], Integer.parseInt(processString[1]));
			queue.enqueue(process);
		}

		int progressTime = 0;
		while(!queue.isEmpty()) {
			Process process = queue.dequeue();

			if(process.getTime() <= q) {
				progressTime += process.getTime();
				System.out.println(process.getName() + " " + progressTime);
			} else {

				// ?????????????????????1??\???????????´???
				int processingTime = process.getTime() - q;

				progressTime += q;

				process.setTime(processingTime);
				queue.enqueue(process);
			}
		}
	}
}