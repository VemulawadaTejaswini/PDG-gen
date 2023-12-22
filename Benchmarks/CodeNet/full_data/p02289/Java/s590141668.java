import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static class PriorityQueue<E> {
		
		private Comparator<E> comparator;
		private int size;
		private List<E> list;
		
		public PriorityQueue(int initialCapacity, Comparator<E> comparator) {
			this.comparator = comparator;
			size = 0;
			list = new ArrayList<>(initialCapacity);
			list.add(null);
		}
		
		public void push(E element) {
			size++;
			if (size < list.size()) {
				list.set(size, element);
			} else {
				list.add(element);
			}
			bottomUp(size);
		}

		private void bottomUp(int idx) {
			if (idx <= 1) return;
			int p;
			if (idx % 2 == 0) p = idx / 2;
			else p = (idx - 1) / 2;
			if (compare(p, idx) < 0) {
				swap(p, idx);
				bottomUp(p);
			}
		}

		private int compare(int idx1, int idx2) {
			return comparator.compare(list.get(idx1), list.get(idx2));
		}
		
		public E poll() {
			if (size <= 0) return null;
			E ret = list.get(1);
			E last = list.get(size);
			list.set(1, last);
			list.set(size, null);
			size--;
			topDown(1);
			return ret;
		}

		private void topDown(int idx) {
			if (size <= 1) return;
			int l = idx * 2;
			int r = l + 1;
			int largest = idx;
			if (l <= size && compare(largest, l) < 0) {
				largest = l;
			}
			if (r <= size && compare(largest, r) < 0) {
				largest = r;
			}
			if (largest != idx) {
				swap(largest, idx);
				topDown(largest);
			}
		}

		private void swap(int i, int j) {
			E tmp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, tmp);
		}
		
		public int size() {
			return size;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i = 1; i <= size; i++) {
				sb.append(list.get(i));
				if (i != size) sb.append(", ");
			}
			sb.append("]");
			return sb.toString();
		}
	}
	
	static class MyComaprator<E extends Comparable<E>> implements Comparator<E> {
		@Override
		public int compare(E o1, E o2) {
			return o1.compareTo(o2);
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	public void run() throws IOException {
		PriorityQueue<Integer> pq = new PriorityQueue<>(10, new MyComaprator<Integer>());
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String cmd = st.nextToken();
			if (cmd.equals("insert")) {
				pq.push(Integer.parseInt(st.nextToken()));
			} else if (cmd.equals("extract")) {
				System.out.println(pq.poll());
			} else {
				break;
			}
		}
		reader.close();
	}
}

