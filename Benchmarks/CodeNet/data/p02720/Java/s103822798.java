import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static int k;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        bfs();
    }

    static void bfs() {
        long cnt = 0;
        LinkedList<Long> ls = new LinkedList<Long>();
        for (int i = 1; i < 10; i++) {
            ls.addLast((long) i);
        }
        while (!ls.isEmpty()) {
            long i = ls.poll();
            cnt++;
            if (cnt == k) {
                System.out.println(i);
                return;
            }
            long x = i % 10;
            if (x >= 1)
                ls.add(i * 10 + x - 1);
            ls.add(i * 10 + x);
            if (i % 10 < 9)
                ls.add(i * 10 + x + 1);
        }
    }
}
