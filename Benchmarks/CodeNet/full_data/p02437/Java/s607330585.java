import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		ArrayList <PriorityQueue<Integer>> queues = new ArrayList <PriorityQueue<Integer>>();  //PriorityQueueのArrayListを生成
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			for (int i=0; i<n; i++) {
				queues.add(new PriorityQueue<Integer>(Collections.reverseOrder()));  //n個のPriorityQueueを追加（逆順）
																					//Collectionsの参考：https://qiita.com/p_shiki37/items/3902f4e3adc3aeb382f1
			}
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int query = sc.nextInt();  //命令 0 insert 1 getMax 2 deleteMax
				int que = sc.nextInt();  //何個目のqueue
				switch (query) {
				//insert(t,x)
				case 0:
					int x = sc.nextInt();
					queues.get(que).add(x);
					break;

				//getMax(t)
				case 1:
					if (queues.get(que).size() != 0) { //空じゃなかったら
						System.out.println(queues.get(que).peek());
					}
					break;

				//deleteMax(t)
				case 2:
					if (queues.get(que).size() != 0) { //空じゃなかったら
						queues.get(que).poll();
					}
					break;

				}
			}
		}
	}
}
