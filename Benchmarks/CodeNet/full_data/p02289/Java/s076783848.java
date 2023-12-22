import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static int h;
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int[] a = new int[2000000];
	h = 0;
	StringBuilder sb = new StringBuilder();
	String[] command;
	int max;
	while (true) {
	    command = br.readLine().split(" ");
	    if (command[0].equals("end")) {
		break;
	    } else if (command[0].equals("insert")) {
		int element = Integer.parseInt(command[1]);
		a[++h] = element;
		int i = h;
		int tmp;
		while (i > 1 && a[i/2] < a[i]) {
		    tmp = a[i];
		    a[i] = a[i/2];
		    a[i/2] = tmp;
		    i /= 2;
		}
	    } else if (command[0].equals("extract")) {
		sb.append(a[1] + "\n");
		a[1] = 0;
		maxHeapify(a, 1);
		h--;
	    }
	}
	System.out.print(sb);
    }
    static void buildMaxHeap(int[] a) {
	for (int i = h / 2; i > 0; i--) {
	    maxHeapify(a, i);
	}
    }
    static void maxHeapify (int[] a, int i) {
	int left = i * 2;
	int right = i * 2 + 1;
	int largest = 0;
	if (left < h && a[left] > a[i]) {
	    largest = left;
	} else {
	    largest = i;
	}
	if (right < h && a[right] > a[largest]) {
	    largest = right;
	}
	if (largest != i) {
	    int tmp = a[i];
	    a[i] = a[largest];
	    a[largest] = tmp;
	    maxHeapify(a, largest);
	}
    }
}