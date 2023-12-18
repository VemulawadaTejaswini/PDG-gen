import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (list.size() > 2 && list.get(2) == 3) {
                deque.addFirst(3);
                list.remove(2);
            } else if (list.size() > 1 && list.get(1) == 2) {
                deque.addFirst(2);
                list.remove(1);
            } else if (list.get(0) == 1) {
                deque.addFirst(1);
                list.remove(0);
            } else {
                System.out.println( - 1);
                return;
            }
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }
}