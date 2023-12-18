import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[] field = new boolean[h * w];
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < h; i++) {
            char[] arr = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                if (arr[j] == '#') {
                    field[i * w + j] = true;
                    deq.add(i * w + j);
                }
            }
        }
        ArrayDeque<Integer> next = new ArrayDeque<>();
        int count = 0;
        while (deq.size() > 0) {
            count++;
            while (deq.size() > 0) {
                int x = deq.poll();
                if (x - w >= 0) {
                    if (!field[x - w]) {
                        next.add(x - w);
                        field[x - w] = true;
                    }
                }
                if (x + w < h * w) {
                    if (!field[x + w]) {
                        next.add(x + w);
                        field[x + w] = true;
                    }
                }
                if (x % w > 0) {
                    if (!field[x - 1]) {
                        next.add(x - 1);
                        field[x - 1] = true;
                    }
                }
                if (x % w < w - 1) {
                    if (!field[x + 1]) {
                        next.add(x + 1);
                        field[x + 1] = true;
                    }
                }
            }
            ArrayDeque<Integer> tmp = next;
            next = deq;
            deq = tmp;
        }
        System.out.println(count - 1);
   }
}