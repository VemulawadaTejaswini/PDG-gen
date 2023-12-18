import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
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
            System.out.println(i);
            a[i] = sc.nextInt();
        }
        LinkedList<Integer> b = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                b.addLast(a[i]);
            } else {
                b.addFirst(a[i]);
            }
        }
        if (n % 2 == 1) {
            Collections.reverse(b);
        }
        String S = "";
        for (int i = 0; i < n; i++) {
            System.out.print(b.get(i) + " ");
        }
    }
}
