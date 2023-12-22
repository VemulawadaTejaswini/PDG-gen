import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Task2[] tasks = new Task2[100000];

		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int second = Integer.parseInt(sc.next());
			tasks[i] = new Task2(name, second);
		}
		int time = 0;
		int head = 0;
		int tail = n;
		while (head != tail) {
			Task2 task = tasks[head];
			head++;
			if (head == 100000) {
				head = 0;
			}
			if (task.getSecond() <= q) {
				time += task.getSecond();
				System.out.print(task.getName() + " ");
				System.out.println(time);

			} else {
				time += q;
				task.setSecond(task.getSecond() - q);
				tasks[tail] = task;
				tail++;
				if (tail == 100000) {
					tail = 0;

				}
			}

		}

	}

}

class Task2 {
	String name;
	int second;

	public Task2(String name, int second) {
		this.name = name;
		this.second = second;

	}

	public String getName() {
		return name;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}