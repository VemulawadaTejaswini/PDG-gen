import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] X = new int[N];
            for (int i = 0; i < N; i++) {
                X[i] = in.nextInt();
            }

            IntListSorted list = new IntListSorted(N);
            for (int i = 0; i < N; i++) {
                list.add(X[i]);
            }

            int[] medians = new int[N];
            for (int i = 0; i < N; i++) {
                list.removeValue(X[i]);
                medians[i] = list.get((N - 2) / 2);
                list.add(X[i]);
            }

            for (int i = 0; i < N; i++) {
                System.out.println(medians[i]);
            }
        }
    }
}

class IntListSorted {
    private static final int EMPTY = -1;
    private int[] values;
    private int size;

    public IntListSorted(int capacity) {
        values = new int[capacity];
        clear();
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() <= 0;
    }

    public boolean contains(int value) {
        return indexOf(value) != EMPTY;
    }

    public boolean add(int value) {
        values[size++] = value;
        for (int i = size - 1; i >= 1; i--) {
            if (values[i - 1] <= values[i]) {
                break;
            }
            swap(values, i - 1, i);
        }
        return true;
    }

    private void swap(int[] values, int i, int j) {
        int swap = values[i];
        values[i] = values[j];
        values[j] = swap;
    }

    public boolean removeValue(int value) {
        int index = indexOf(value);
        if (index == EMPTY) {
            return false;
        }
        remove(index);
        return true;
    }

    public int remove(int index) {
        int value = values[index];
        for (int i = index; i + 1 < size; i++) {
            values[i] = values[i + 1];
        }
        size--;
        return value;
    }

    public int get(int index) {
        return values[index];
    }

    public void add(int index, int value) {
        assert index <= size;
        for (int i = size - 1; i >= index; i--) {
            values[i + 1] = values[i];
        }
        size++;
        values[index] = value;
    }

    public int indexOf(int value) {
        int index = Arrays.binarySearch(values, 0, size, value);
        if (index < 0) {
            return EMPTY;
        }
        int index0 = index;
        for (;;) {
            index = Arrays.binarySearch(values, 0, index0, value);
            if (index < 0) {
                break;
            }
            index0 = index;
        }
        return index0;
    }

}
