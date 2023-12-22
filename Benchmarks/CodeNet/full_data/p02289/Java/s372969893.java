import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        while (true) {
            String cmd = scanner.next();
            if ("insert".equals(cmd)) {
                a.add(0, scanner.nextInt());
                maxHeapify(a, 0);
            } else if ("extract".equals(cmd)) {
                if (a.size() < 1) {
                    continue;
                }
                System.out.println(a.get(0));
                a.set(0, a.get(a.size() - 1));
                a.remove(a.size() - 1);
                maxHeapify(a, 0);
            } else {
                break;
            }
        }
    }

    private static void maxHeapify(List<Integer> a, int i) {
        int l = (i + 1) * 2 - 1;
        int r = l + 1;
        int largest = i;
        if (l <= a.size() - 1 && a.get(l) > a.get(i)) {
            largest = l;
        }
        if (r <= a.size() - 1 && a.get(r) > a.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            int t = a.get(i);
            a.set(i, a.get(largest));
            a.set(largest, t);
            maxHeapify(a, largest);
        }
    }

    private static void buildMaxHeap(List<Integer> a) {
        for (int i = a.size() / 2; i >= 0; i--) {
            maxHeapify(a, i);
        }
    }
}