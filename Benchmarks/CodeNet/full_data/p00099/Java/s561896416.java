import java.util.Scanner;

// Java8
public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		int n = sc.nextInt();
		int q = sc.nextInt();
		KVHeap heap = new KVHeap(n);
		for(int i=0; i<q; i++) {
			int a = sc.nextInt();
			int v = sc.nextInt();
			heap.add(a, v);
			int top = heap.top();
			System.out.println(top + " " + heap.getValue(top));
		}
	}
}
class KVHeap {
	int size;
	int[] value;
	int[] heap;
	int[] pos;

	KVHeap(int n) {
		size = n;
		value = new int[n+1];
		heap = new int[n+1];
		pos = new int[n+1];
		for(int i=1; i<=size; i++) {
			heap[i] = i;
			pos[i] = i;
		}
	}

	int getValue(int k) {
		return value[k];
	}

	void siftUp(int x){
		while(pos[x] > 1) {
			int p = pos[x];
			int ppar = p / 2;
			int xpar = heap[ppar];
			if(value[x]>value[xpar] || (value[x]==value[xpar] && x<xpar)) {
				heap[ppar] = x;
				heap[p] = xpar;
				pos[xpar] = p;
				pos[x] = ppar;
			} else break;
		}
	}

	void siftDown(int x) {
		while(pos[x]*2<=size) {
			int p = pos[x];
			int pchi = p * 2;
			int xchi = heap[pchi];
			if(pchi<size) {
				int xright = heap[pchi+1];
				if(value[xright]>value[xchi] || (value[xright]==value[xchi] && xright<xchi)) {
					xchi = xright;
					pchi++;
				}
			}
			if(value[x]<value[xchi] || (value[x]==value[xchi] && x>xchi)) {
				heap[pchi] = x;
				heap[p] = xchi;
				pos[xchi] = p;
				pos[x] = pchi;
			} else break;
		}
	}

	void add(int k, int v) {
		value[k] += v;
		if(v>0) {
			siftUp(k);
		} else {
			siftDown(k);
		}
	}

	int top() {
		return heap[1];
	}
}
