import java.util.*;

class Heap {
    public Vector<Integer> heap;

    public Heap() {
        heap =  new Vector<Integer>();
    }

    public void insert(int number) {
        if (this.heap.size() == 0) {
            this.heap.add(0);
            this.heap.add(number);
        } else {
            (this.heap).add(number);
        }
    }

    public void heapify() {
        for (int i = (this.heap).size()/2; i > 0; i--) {
            int value = heap.get(i);
            int length = (this.heap).size()-1;
            int v = heap.get(i);
            int j = 0;
            boolean isHeap = false;
            while (!isHeap && 2*i <= length) {
                j = 2*i;
                if (j < length) {
                    if (heap.get(j) < heap.get(j+1)) {
                        j++;
                    }
                }
                if (v >= heap.get(j)) {
                    isHeap = true;
                }
                else {
                    heap.set(i, heap.get(j));
                    i = j;
                }
            }
            heap.set(i, v);
        }
    }

    public Integer returnmax() {

        return heap.get(1);
    }


    public void removemax() {
        heap.set(1, heap.get(heap.size()-1));
        heap.setSize(heap.size()-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Heap heapvalores = new Heap();

        while (in.hasNext()) {
            String operation =  in.nextLine();

            if (operation.charAt(0) == 'i') {
                String sNumber = operation.substring(7, operation.length());
                int number = Integer.parseInt(sNumber);
                heapvalores.insert(number);
                heapvalores.heapify();
            }
            else if (operation.charAt(1) == 'x') {
                System.out.println(heapvalores.returnmax());
                heapvalores.removemax();
                heapvalores.heapify();

            } else {

            }
        }

    }
}
