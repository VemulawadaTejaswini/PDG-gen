import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  // プロセス数
		int Q = sc.nextInt();  // クオンタム
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		Queue<String> queue = new ArrayDeque<String>();  // 主役
		List<String> terminated = new ArrayList<String>();  // プロセスの名前を終わった順に格納する
		int timestamp = 0;

		for(int i = 0; i < N; i++) {
			String name = sc.next();
			int time = sc.nextInt();
			hmap.put(name, time);
			queue.add(name);
		}

		while(!queue.isEmpty()) {
			String p = queue.peek();
			if(hmap.get(p) <= Q) {  // クオンタム以内にプロセスpが終了する場合
				timestamp += hmap.get(p);
				terminated.add(queue.poll());
				hmap.put(p, timestamp);   // プロセスpが終了した時刻を記録
			}else {                 // クオンタム以内にプロセスpが終わらない場合
				timestamp += Q;
				queue.add(queue.poll());  // プロセスを待ち行列の最後尾へ
				hmap.put(p, hmap.get(p) - Q);
			}
		}

		for(String p : terminated) {
			System.out.println(p + " " + hmap.get(p));
		}

		sc.close();
	}
}
