import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n + 1]; //1オリジンにする
        for (int i = 1; i <= n; i++) h[i] = scanner.nextInt();

        for (int i = n / 2; i >= 1; i--) maxHeapify(h, i);

        for (int i = 1; i <= n; i++)
            System.out.print(" " + h[i]);
        System.out.print("\n");

    }

    private static void maxHeapify(int[] h, int i) {

        int n = h.length - 1;
        int left = 2 * i;
        int right = 2 * i +1;

        int largest;
        if (left <= n && h[left] > h[i])
            largest = left;
        else
            largest = i;
        if (right <= n && h[right] > h[largest])
            largest = right;

        if (largest != i) {
            swap(h, i, largest);
            maxHeapify(h, largest);
        }
    }

    private static void swap(int[] h, int i, int i2) {
        int tmp = h[i];
        h[i] = h[i2];
        h[i2] = tmp;
    }
}

