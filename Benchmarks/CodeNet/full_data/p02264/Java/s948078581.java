import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n, q, time_cost = 0;
		Task temp = new Task();
		Queue costQueue = new Queue(), endQueue = new Queue();
		n = cin.nextInt();
		q = cin.nextInt();
		while (cin.hasNext()) {
			temp.name = cin.next();
			temp.costTime = cin.nextInt();
			costQueue.insert(temp);
		}
		while (!costQueue.empty()) {
			temp = costQueue.remove();
			if (temp.costTime <= q) {
				time_cost += temp.costTime;
				temp.endTime = time_cost;
				endQueue.insert(temp);
				continue;
			}
			time_cost += q;
			temp.costTime -= q;
			costQueue.insert(temp);
		}
		while (!endQueue.empty()) {
			temp = endQueue.remove();
			System.out.println(temp.name + " " + temp.endTime);
		}
	}
}

class Task {
	String name;
	int costTime;
	int endTime;
}

class Queue {
	int MAX = 100002;
	Task[] entry = new Task[MAX];
	int front;
	int rear;
	int count;
	public Queue() {
		for (int i = 0; i < MAX; i++) {
			entry[i] = new Task();
		}
		front = 0;
		rear = -1;
		count = 0;
	}
	public void insert(Task t) {
		rear = (rear + 1) % MAX;
		count++;
		entry[rear].name = t.name;
		entry[rear].costTime = t.costTime;
		entry[rear].endTime = t.endTime;
	}
	public Task remove() {
		Task temp = entry[front];
		front = (front + 1) % MAX;
		count--;
		return temp;
	}
	public boolean empty() {
		return (count == 0);
	}
}
