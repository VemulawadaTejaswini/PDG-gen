import java.util.*;

class Main {
    int heap[];
    int pos;
    int size;

    public Main() {
        this.heap = new int[2000000];
        this.size = 1999999;
        this.pos = 1;
    }

    void heapify() {
        for (int i = this.size/2; i > 0; i--) {
            int value = heap[i];
            int v = heap[i];
            int j = 0;

            boolean isHeap = false;

            while (!isHeap && 2*i <= this.size) {
                j = 2*i;
                if (j < this.size) {
                    if (heap[j] < heap[j+1]) {
                        j++;
                    }
                }
                if (v >= heap[j]) {
                    isHeap = true;
                }
                else {
                    heap[i] = heap[j];
                    i = j;
                }
                heap[i] = v;
            }
        }
    }

    void insert(int value) {
        this.heap[pos] = value;
        boolean isHeap = false;
        int i = pos;
        while(i > 0 && !isHeap) {
            int j = (i-1)/2;
            if (heap[i] > heap[j]) {
                int temp = heap[i];
                heap[i] = heap[j];
                heap[j] = temp;
            } else {
                isHeap = true;
            }
            i = j;
        }
        pos++;
    }

    int remove() {
        if (pos > 1) {
            int removed = heap[1];
            heap[1] = heap[size-1];
            heapify();
            pos--;
            return removed;
        }
        return 0;
    }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            Main heap = new Main();

            String operation = in.nextLine();

            while (in.hasNext() && !operation.equals("end")) {
                if (operation.charAt(0) == 'i') {
                    String sNumber = operation.substring(7, operation.length());
                    int number = Integer.parseInt(sNumber);
                    heap.insert(number);
                } else {
                    int removed = heap.remove();
                    System.out.println(removed);
                }
                operation = in.nextLine();
            }
        }

}

