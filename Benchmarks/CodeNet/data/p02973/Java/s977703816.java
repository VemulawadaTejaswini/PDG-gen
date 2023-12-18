import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
 
public class Main {
	private class Data implements Comparable<Data> {
		int index = 0;
		int num = 0;
		boolean exist = true;
		
		public Data(int index, int num) {
			this.index = index;
			this.num = num;
		}

		@Override
		public int compareTo(Data o) {
			return o.num - this.num;
		}
		
		
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		LinkedList<Data> list = new LinkedList<Data>();
		Data[] ds = new Data[N];
		for (int i=0; i<N; i++) {
			ds[i] = new Data(i, in.nextInt());
			list.add(ds[i]);
		}
		in.close();
		Collections.sort(list);
		
		int count = 0;
		
		
		while (true) {
			int min = 0;
			count++;
			ListIterator<Data> it = list.listIterator();
			Data top = it.next();
			it.remove();
			while (it.hasNext()) {
				for (; min<N; min++) {
					if (ds[min].exist) {
						break;
					}
				}
				Data next = it.next();
				if (top.index > next.index && top.num > next.num) {
					top = next;
					next.exist = false;
					it.remove();
					if (next.index <= min) {
						break;
					}
				}
			}
			
			if (list.size() == 0) {
				break;
			}
		}
		
		
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
