import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> deq = new ArrayDeque<>();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (n % 2 == 0) {
                if (i % 2 == 0) {
                    deq.addLast(num);
                } else {
                    deq.addFirst(num);
                }
            } else {
                if (i % 2 == 0) {
                    deq.addFirst(num);
                } else {
                    deq.addLast(num);
                }
            }
        }
        deq.stream().forEach(i -> System.out.print(i + " "));
    }
}