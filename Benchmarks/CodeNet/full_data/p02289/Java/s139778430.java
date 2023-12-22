import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    int h = 0;
    int[] arr;
 
    void run() {
        Scanner sc = new Scanner(System.in);
        arr = new int[2000100];
        while (true) {
            String command = sc.next();
            int i;
            if (command.equals("end")){
                break;
            } else if (command.equals("insert")) {
                i = sc.nextInt();
                insert(i);
            } else {
                System.out.println(heapExtractMax(arr));
            }
        }
    }
 
    int parent(int i) { return i / 2; }
    int left(int i) { return 2 * i; }
    int right(int i) { return 2 * i + 1; }
 
    void insert(int key) {
        h++;
        arr[h] = Integer.MIN_VALUE;
        heapIncreaseKey(arr, h, key);
    }
 
    void heapIncreaseKey(int[] arr, int i, int key) {
        if (key < arr[i]) {
            throw new RuntimeException("新しいキーは現在のキーより小さい");
        }
        arr[i] = key;
        while (i > 1 && arr[parent(i)] < arr[i]) {
            int tmp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = tmp;
            i = parent(i);
        }
    }
 
    int heapExtractMax(int[] arr) {
        if (h < 1) {
            throw new RuntimeException("ヒープアンダーフロー");
        }
        int max = arr[1];
        arr[1] = arr[h];
        h--;
        maxHeapify(arr, 1);
        return max;
    }
 
    void maxHeapify(int[] arr, int i) {
        int largest;
        int l = left(i);
        int r = right(i);
        if (l <= h && arr[l] > arr[i]) {
            largest = l;
        } else {
            largest = i;
        }
 
        if (r <= h && arr[r] > arr[largest]) {
            largest = r;
        }
 
        if (largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            maxHeapify(arr, largest);
        }
    }
 
    void buildMaxHeap(int[] arr) {
        for (int i = h / 2; i > 0; i--) {
            maxHeapify(arr, i);
        }
    }
 
    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
}
