
//10:51

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	class V implements Comparable<V> {
		int index;
		int value;

		V(int i, int v) {
			index = i;
			value = v;
		}

		public int compareTo(V t) {
			if (value - t.value == 0) {
				return index - t.index;
			}
			return value - t.value;
		}
	}

	Scanner sc = new Scanner(System.in);

	@SuppressWarnings("unchecked")
	void run() {
		for (;;) {

			int n = sc.nextInt();
			int d = sc.nextInt();

			if (n + d == 0) {
				break;
			}

			// int data[][] = new int[n][];
			LinkedList<Integer> data[] = new LinkedList[n];
			V sum[] = new V[n];
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				data[i] = new LinkedList<Integer>();
				data[i].add(0);
				sum[i] = new V(i, 0);
				for (int j = 0; j < m; j++) {
					int c = sc.nextInt();
					data[i].add(c);
					sum[i].value += c;
				}
			}

			// System.out.println(n + " " +a.size());
			boolean ret = true;
			for (;;) {
				int index = 0;
				int diff = Integer.MAX_VALUE;
				int max = 0;
				int min = Integer.MAX_VALUE;
				
				for (int i = 0; i < n; i++) {
					min = Math.min(min, sum[i].value);
					if(max== sum[i].value){
						if(data[i].isEmpty()){
							continue;
						}
						if(diff > data[i].peekFirst()){
							diff  = data[i].peekFirst();
							index= i;
							max = sum[i].value;
						}
					}else if(max < sum[i].value){
						index= i;
						max = sum[i].value;
						diff = Integer.MAX_VALUE;
					}
				}
				
				if(max - min > d){
					ret = false;
					break;
				}
				
				if(data[index].isEmpty()){
					ret = true;
					break;
				}
				sum[index].value -= data[index].pollFirst();
			}
			if (ret) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}