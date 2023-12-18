import java.util.*;

class Main {
    long k;
    int count = 0;
    Queue<Long> q = new LinkedList<>();

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();

        for (long i = 1; i <= 9; i++) {
            q.add(i);
            count++;
            if (count == k) {
                System.out.println(i);
                System.exit(0);
            }
        }

        while(true) {
            long num = q.poll();
            long lastNum = num % 10;
            if (lastNum != 0) bfs(10 * num + lastNum - 1);
            bfs(10 * num + lastNum);
            if (lastNum != 9) bfs(10 * num + lastNum + 1);
        }
    }

    private void bfs(long i) {
        q.add(i);
        count++;
        if (count==k) {
            System.out.println(i);
            System.exit(0);
        }
    }
}
