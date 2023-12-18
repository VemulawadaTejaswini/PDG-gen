import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Deque<Integer> b = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                b.addLast(a[i]);
            } else {
                b.addFirst(a[i]);
            }
        }
        Integer c[] = new Integer[n];
        if (n % 2 == 1) {
            Collections.reverse(Arrays.asList(b.toArray(c)));
        } else {
            b.toArray(c);
        }
        for (int v : c) {
            System.out.print(Integer.toString(v) + " ");
        }
        System.out.println("");
    }
}