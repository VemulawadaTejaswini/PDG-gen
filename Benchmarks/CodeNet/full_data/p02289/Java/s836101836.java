import java.util.Scanner;

public class Main {
    public static int H = 0;
    public static int[] heap = new int[2000000];
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true) {
            String cmd = input.next();
            if(cmd.equals("insert")) {
                int key = Integer.parseInt(input.next());
                insert(key);
            } else if(cmd.equals("extract")){
                System.out.println(extract());
            } else if(cmd.equals("end")){
                break;
            }
        }
    }
    public static void insert(int key) {
        H++;
        heap[H] = Integer.MIN_VALUE;
        heapIncreaseKey(H, key);
    }
    public static void heapIncreaseKey(int i, int key) {
        if(key < heap[i]) return;
        heap[i] = key;
        while( i > 1 && heap[i/2] < heap[i]) {
            int temp = heap[i];
            heap[i] = heap[i/2];
            heap[i/2] = temp;
            i = i/2;
        }
    }
    public static int extract() {
        int max;
        if (H < 1) return Integer.MIN_VALUE;
        max = heap[1];
        heap[1] = heap[H--]; // 取出最大值，将最后一个元素置于堆顶
        maxHeapify(1);
        return max;
    }
    public static void maxHeapify(int i) {
        int left = 2*i;
        int right = 2*i + 1;
        int largest;
        if(left <= H && heap[left] > heap[i]) {
            largest = left;
        } else {
            largest = i;
        }
        if(right <= H && heap[right] > heap[largest]) {
            largest = right;
        }

        if(largest != i) {// i的子节点值更大时
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;
            maxHeapify(largest);
        }
    }
}

