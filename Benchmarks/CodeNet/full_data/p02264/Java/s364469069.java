import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] one = s.nextLine().split(" ");
		QueueImpl qqq = new Main().new QueueImpl();
		for(int i=0 ; i<new Integer(one[0]).intValue() ; i++){
			String[] two = s.nextLine().split(" ");
			Process p = new Main().new Process(two[0], new Integer(two[1]).intValue());
			qqq.enqueue(p);
		}

		int quon = new Integer(one[1]).intValue();
		int totalTime = 0;
		while(! qqq.isEmpty()) {
			Process p = qqq.dequeue();
			if(quon >= p.time) {
				totalTime += p.time;
				System.out.println(p.name + " " + totalTime);
			}else {
				p.time = p.time - quon;
				qqq.enqueue(p);
				totalTime += quon;
			}
		}
	}

	public class QueueImpl {
		Process[] array;
		int head;
		int tail;
		public QueueImpl() {
			array = new Process[100000];
			head = -1;
			tail = -1;
		}

		public void enqueue(Process obj) {
			if(tail == 99999)
				tail = -1;
			tail++;
			array[tail] = obj;
		}

		public Process dequeue() {
			if(head == 99999)
				head = -1;
			head++;
			Process tmp = array[head];
			array[head] = null;
			return tmp;
		}

		public boolean isEmpty(){
			return this.head == this.tail;
		}
	}

	public class Process {
		String name;
		int time;
		public Process(String name, int time) {
			this.name = name;
			this.time = time;
		}
	}
}