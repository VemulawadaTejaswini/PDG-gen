import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner (System.in);
	int h = Integer.parseInt(scan.nextLine());
	int[] heap = new int[h+1];
	String[] input = scan.nextLine().split(" ");
	for (int i = 0; i < h; i++) {
	    heap[i+1] = Integer.parseInt(input[i]);
	}
	BinaryHeap bh = new BinaryHeap(h+1, heap);
	bh.printHeap();
    }
}
class BinaryHeap {
    int h;
    int[] heap;
    BinaryHeap (int h, int[] heap) {
	this.h = h;
	this.heap = heap;
    }
    void printHeap () {
	for (int i = 1; i < h; i++) {
	    printNode(i);
	}
    }
    void printNode (int id) {
	StringBuilder sb = new StringBuilder();
	sb.append("node " + id);
	sb.append(": key = " + heap[id] + ", ");
	sb.append("parent key = " + heap[id/2] + ", ");
	if (id*2 < h) {
	    sb.append("left key = " + heap[id*2] + ", ");
	}
	if ((id*2)+1 < h) {
	    sb.append("right key = " + heap[id*2+1] + ", ");
	}
	System.out.println(sb);
    }
}