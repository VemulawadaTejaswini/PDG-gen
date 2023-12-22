import java.util.Scanner;

class Main {
    static int[] heap = new int[2000000];
    static int size = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String command = sc.next();
            switch(command.charAt(0)) {
                case 'i':
                    int number = sc.nextInt();
                    insert(number);
                    break;
                case 'e':
                    if (command.charAt(1) == 'x') {
                        System.out.println(extract());
                        break;
                    } else {
                        return;
                    }
            }
        }
    }

    public static int extract() {
        int queue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        maxHeap(0);
        return queue;
    }

    public static void insert(int number) {
        heap[size] = number;
        size++;
        swapParent(size - 1);
    }

    public static void swapParent(int i) {
        if (i > 0 && heap[i] > heap[(i - 1) / 2]) {
            int h = heap[(i - 1) / 2];
            heap[(i - 1) / 2] = heap[i];
            heap[i] = h;
            swapParent((i - 1) / 2);
        }
    }

    public static void maxHeap(int i) {
        if (i * 2 + 1 >= size) {
            return;
        }

        int tmp = i * 2 + 1;

        if (i * 2 + 2 < size) {
            if (heap[i * 2 + 1] < heap[i * 2 + 2]) {
                tmp = i * 2 + 2;
            }
        }

        if (heap[i] < heap[tmp]) {
            int h = heap[i];
            heap[i] = heap[tmp];
            heap[tmp] = h;
            maxHeap(tmp);
        }
    }
}
