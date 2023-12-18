import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        Queue<Long> queue = new PriorityQueue<>();
        for (int i = 1; i < 11; i++) {
            List<Integer> list = new ArrayList<>();
            dfs(i, list, queue);
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        System.out.println(queue.poll());
    }

    static void dfs(int l, List<Integer> list, Queue<Long> queue) {
        if (list.size() == l) {
            queue.add(convertListToNumber(list));
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (i == 0 && list.size() == 0) {
            } else {
                list.add(i);
                if (isLunLun(list)) {
                    dfs(l, list, queue);
                }
                list.remove(list.size() - 1);
            }
        }
    }

    static boolean isLunLun(List<Integer> list) {
        if (list.size() == 1) {
            return true;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (Math.abs(list.get(i) - list.get(i + 1)) > 1) {
                return false;
            }
        }
        return true;
    }

    static long convertListToNumber(List<Integer> list) {
        long num = 0;
        for (int i = 0; i < list.size(); i++) {
            num += list.get(i) * Math.pow(10, list.size() - 1 - i);
        }
        return num;
    }

}