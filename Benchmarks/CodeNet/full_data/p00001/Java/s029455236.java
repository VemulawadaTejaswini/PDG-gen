import java.util.*;

class Main {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 10;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (b - a));

        for (int i = 0; i < n; i ++) {
            int x = input.nextInt();
            pq.add(x);
        }

        input.close();
        for (int i = n-1; i > 6; i--) {
            System.out.println(pq.poll());
        }
    }
}
