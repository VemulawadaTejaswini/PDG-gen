import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                b.add(a[i]);
            } else {
                b.add(0, a[i]);
            }
        }
        if (n % 2 == 1) {
            Collections.reverse(b);
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(b.get(i) + " ");
        }
        System.out.println(b.get(n - 1));
    }
}
