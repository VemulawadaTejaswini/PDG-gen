import java.util.Scanner;

public class Main {
	private static int head = 0;// キューの先頭ポインタ
	private static int tail = 0;// キューの末尾ポイント
	private static final int MAX = 100005; // 制約のプロセス数が10万なので少し多めに。
	private static Process[] queue = new Process[MAX];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		// すべてのプロセスをキューに追加
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int time = sc.nextInt();
			Process p = new Process(name, time);
			queue[i] = p;
		}
		tail = n;
		// すべてのプロセスが完了する（＝キューが空になる）まで実行
		int elaps = 0; // 経過時間
		while (!(head == tail)) {
			Process p = dequeue();
			if (p.time > q) {
				p.time = p.time - q;
				enqueue(p);
				elaps += q;
			} else {
				elaps += p.time;
				System.out.println(p.name + " " + elaps);
			}
		}

	}

	private static void enqueue(Process p) {
		// 中身が満タンでないことを判定
		if ((tail + 1) % MAX == head) {
			System.err.println("エラー（オーバーフロー）");
		} else {
			queue[tail] = p;
			tail = (tail + 1) % MAX;
		}
	}

	private static Process dequeue() {
		// 中身が空じゃないことを判定
		Process ret = null;
		if (head == tail) {
			System.err.println("エラー（アンダーフロー）");
		} else {
			ret = queue[head];
			head = (head + 1) % MAX;
		}
		return ret;

	}

}

class Process {
	String name;
	int time;

	public Process(String name, int time) {
		this.name = name;
		this.time = time;
	}

}
