import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PriorityQueue {
    int H = 0;
    long[] A;

    PriorityQueue() {
        A = new long[2000000];
    }

    void insert(long key) {
        H++;
        A[H] = Long.MIN_VALUE;
        heapIncreaseKey(H, key);
    }

    private void swap(int i, int j) {
        long tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    private void heapIncreaseKey(int i, long key) {
        if (key < A[i]) return;
        A[i] = key;
        while (i > 1 && A[i / 2] < A[i]) {
            swap(i, i / 2);
            i = i / 2;
        }
    }

    long extract() {
        if (H < 1) throw new ArrayIndexOutOfBoundsException("The queue is empty.");

        long max = A[1];
        A[1] = A[H];
        H--;
        maxHeapfy(1);

        return max;
    }

    private void maxHeapfy(int i) {
        int left = i * 2;
        int right = i * 2 + 1;

        int largest = i;
        if (left <= H && A[left] > A[i])
            largest = left;
        if (right <= H && A[right] > A[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            maxHeapfy(largest);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            PriorityQueue queue = new PriorityQueue();

            String order = in.readLine();
            while (!order.equals("end")) {
                if (order.startsWith("i")) {
                    long k = Long.parseLong(order.split(" ")[1]);
                    queue.insert(k);
                } else {
                    System.out.println(queue.extract());
                }
                order = in.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

