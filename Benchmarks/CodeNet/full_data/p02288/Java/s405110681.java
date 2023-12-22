import java.util.*;
import java.io.*;

class Main {

	static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		size = Integer.parseInt(br.readLine());
		String line = br.readLine();

		String[] str = line.split(" ");
		int[] a = new int[size+1];
		for (int i=0; i<size; i++) {
			a[i+1] = Integer.parseInt(str[i]);
		}

		buildMaxHeap(a);

		StringBuilder sb = new StringBuilder();
		for (int i=1; i<size+1; i++) {
			sb.append(" ").append(a[i]);
		}
		System.out.println(sb);
	}

	static void maxHeapify(int[] a,int i){
		int left = i*2;
		int right = i*2+1;
		int largest;
		if (left <= size && a[left] > a[i])
			largest = left;
		else
			largest = i;
		if (right <= size && a[right] > a[largest])
			largest = right;
		if (largest != i) {
			swap(a,i,largest);
			maxHeapify(a,largest);
		}
	}

	static void buildMaxHeap(int[] a){
		for (int i=size/2; i>0; i--) {
			maxHeapify(a,i);
		}
	}

    static void swap(int[] a,int idx1,int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
}