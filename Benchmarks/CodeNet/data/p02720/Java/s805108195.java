import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
        q.add(6); q.add(7); q.add(8); q.add(9);
        for (int i = 0; i < k-1; i++) {
            int x = q.poll();
            int y = x%10;
            if(y != 0) q.add(10*x - 1);
            q.add(10*x + y);
            if(y != 9) q.add(10*x +1);
        }
        System.out.println(q.poll());
        sc.close();

    }

}
