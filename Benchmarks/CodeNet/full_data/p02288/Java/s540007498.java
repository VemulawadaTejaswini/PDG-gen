import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int[] a = new int[h];
        for (int i = 0; i < h; i++) {
            a[i] = sc.nextInt();
        }

        buildMaxHeap(a);

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < h; i++) {
            sb.append(' ').append(a[i]);
        }
        System.out.println(sb);
    }

    public static void buildMaxHeap(int[] a) {
        int h = a.length;
        for (int i = h / 2; i >= 0; i--) {
            maxHeapify(a, i);
        }
    }

    public static void maxHeapify(int[] a, int i) {
        int h = a.length;

        int left = i * 2 + 1;
        int right = left + 1;

        int largest;

        if (left < h && a[left] > a[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right < h && a[right] > a[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            maxHeapify(a, largest);
        }
    }
}