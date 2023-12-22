import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        PriorityQueue pq = new PriorityQueue();
        while (!line.equals("end")) {
            String[] split = line.split(" ");
            if (split[0].equals("insert")) {
                pq.insert(Integer.parseInt(split[1]));
            } else {
                System.out.println(pq.extractMax());
            }
            line = in.readLine();
        }
    }
}

class PriorityQueue {
    private ArrayList<Integer> list;

    PriorityQueue() {
        list = new ArrayList<>();
    }

    private static int getParentIndex(int i) {
        return (i - 1) / 2;
    }

    private static int getLeftIndex(int i) {
        return i * 2 + 1;
    }

    private static int getRightIndex(int i) {
        return i * 2 + 2;
    }

    private void swap(int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    void insert(int k) {
        list.add(k);
        propagateUp(list.size() - 1);
    }

    private void propagateUp(int currentIndex) {
        if (currentIndex > 0) {
            int currentVal = list.get(currentIndex);
            int parentIndex = getParentIndex(currentIndex);
            int parentVal = list.get(parentIndex);
            if (currentVal > parentVal) {
                swap(parentIndex, currentIndex);
            }
            propagateUp(parentIndex);
        }
    }

    int extractMax() {
        int max;
        if (list.size() > 1) {
            max = list.get(0);
            list.set(0, list.remove(list.size() - 1));
            heapify(0);
        } else {
            max = list.remove(0);
        }
        return max;
    }

    private void heapify(int i) {
        int leftIndex = getLeftIndex(i);
        if (leftIndex < list.size()) {
            int rightIndex = getRightIndex(i);
            int maxIndex = leftIndex;
            if (rightIndex < list.size() && list.get(rightIndex) > list.get(leftIndex)) {
                maxIndex = rightIndex;
            }
            if (list.get(maxIndex) > list.get(i)) {
                swap(maxIndex, i);
                heapify(maxIndex);
            }
        }
    }
}
