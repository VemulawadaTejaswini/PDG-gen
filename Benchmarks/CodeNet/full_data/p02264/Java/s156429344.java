import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {

		// Queueはインターフェースなので、実装クラスのArrayDequeで実装
		Queue<Process> queue = new ArrayDeque<>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);// プロセス数
			int q = Integer.parseInt(str[1]);// クオンタム

			for (int i = 0; i < n; i++) {
				String[] tmp = br.readLine().split(" ");
				String name = tmp[0];// プロセス名
				int time = Integer.parseInt(tmp[1]);// 処理時間
				// キューに追加
				queue.add(new Process(name, time));
			}

			int total = 0;// 終了時刻
			// peek()メソッドは要素がなくても例外はスローせずnullを返す
			while (queue.peek() != null) {
				// キューから取り出し
				Process curPrcs = queue.remove();
				int curTime = Math.min(q, curPrcs.time);
				total += curTime;
				curPrcs.time -= curTime;
				if (curPrcs.time > 0) {
					// キューに追加
					queue.add(curPrcs);
				} else {
					System.out.println(curPrcs.name + " " + total);
				}

			}


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

// プロセスの情報
class Process {
	String name;// プロセス名
	int time;// 処理時間

	public Process(String name, int time) {
		this.time = time;
		this.name = name;

	}

}

