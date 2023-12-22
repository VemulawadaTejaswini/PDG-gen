

import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int[] arr = new int[h + 1];
        for (int i = 1; i < h + 1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < h + 1; i++) {
            int key = arr[i];
            Integer parent = i / 2 == 0 ? null : arr[i / 2];
            Integer left = i * 2 >= h + 1 ? null : arr[i * 2];
            Integer right = i * 2 + 1 >= h + 1 ? null : arr[i * 2 + 1];
            System.out.println("node "
                    + i
                    + ": key = " + key + ", "
                    + (parent == null ? "" : "parent key = " + parent + ", ")
                    + (left == null ? "" : "left key = " + left + ", ")
                    + (right == null ? "" : "right key = " + right + ", ")
            );
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}

