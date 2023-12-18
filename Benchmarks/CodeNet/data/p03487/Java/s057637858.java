
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int totalCount = 0;
        int target = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            int before = arr[i - 1];
            int current = arr[i];
            if (before == current) {
                count++;
            } else {
//                debug(count, target);
                totalCount += count - target >= 0 ? count - target : count;
                target = current;
                count = 1;
            }
        }
//        debug(count, target);

        totalCount += count - target >= 0 ? count - target : count;
        System.out.println(totalCount);
    }


    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
