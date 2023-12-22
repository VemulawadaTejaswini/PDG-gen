import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Heap elem = new Heap(2000001);
		String action = in.nextLine();
		if(!action.equals("end")) {
			while(!action.equals("end")) {				
				if(action.charAt(0) == 'i') {
					int key = Integer.parseInt(action.split(" ")[1]);
					elem.insert(key);
				}else {
					int sout = elem.extract();
					if(sout != 2000000001)
						System.out.println(sout);
				}
				action = in.nextLine();
			}
		}
	}
}
 class Heap {
	private int[] Heap;
	private int size;
	private int maxSize;
	
	public Heap(int maxSize) {
		this.Heap = new int[maxSize];
		this.maxSize = maxSize;
		this.size = 0;
		this.Heap[0] = 2000000001;
	}
	
	//aux
	private int parent(int pos) {
		return pos /2;
	}
	private int leftChild(int pos) {
		return pos*2;
	}
	private int rightChild(int pos) {
		return (pos*2)+1;
	}
	private boolean isLeaf(int pos) {
		if(pos >= (Math.ceil(this.size/2.0)) && pos <= this.size) {
			return true; 
		}
		return false;
	}
	private void swap(int fpos, int spos) {
		int aux = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = aux;
	}
	private void heapify(int pos) {
		if(isLeaf(pos) && pos != 1) {
			return;
		}
		if(Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {
			if(Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
				swap(pos, leftChild(pos));
				heapify(leftChild(pos));
			}else {
				swap(pos, rightChild(pos));
				heapify(rightChild(pos));
			}
		}
	}
	public void insert(int it) {
		Heap[++this.size] = it;
		int curr = this.size;
		while(Heap[curr] > Heap[parent(curr)]) {
			swap(curr, parent(curr));
			curr = parent(curr);
		}
	}
	public int extract() {
		if(this.size == 0) {
			return 2000000001;
		}
		int ext = Heap[1];
		Heap[1] = Heap[this.size--];
		Heap[size + 1] = 0;
		heapify(1);
		return ext;
	}
}
