import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    static void swap(long[] A, int i, int j) {
        long tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    static void maxHeapfy(long[] A, int i, int n) {
        int left = i * 2;
        int right = i * 2 + 1;

        int largest = i;
        if (left <= n && A[left] > A[i])
            largest = left;
        if (right <= n && A[right] > A[largest])
            largest = right;

        if (largest != i) {
            swap(A, i, largest);
            maxHeapfy(A, largest, n);
        }
    }

    static void buildMaxHeap(long[] A, int n) {
        for (int i = n / 2; i > 0; i--) {
            maxHeapfy(A, i, n);
        }
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            final int n = Integer.parseInt(in.readLine());
            long[] A = new long[n + 1];

            String[] line = in.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                A[i + 1] = Long.parseLong(line[i]);
            }

            buildMaxHeap(A, n);

            System.out.println(" " + Arrays.stream(A).skip(1).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

