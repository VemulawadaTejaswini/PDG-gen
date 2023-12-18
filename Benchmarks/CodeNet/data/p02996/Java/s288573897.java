import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Work work[] = new Work[n];
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(sc.next());
            int limit = Integer.parseInt(sc.next());
            work[i] = new Work(time, limit);
        }
        sc.close();
        Arrays.sort(work, (x, y) -> x.limit - y.limit);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += work[i].time;
            if (ans > work[i].limit) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    static class Work {
        int time;
        int limit;

        Work(int time, int limit) {
            this.time = time;
            this.limit = limit;
        }
    }
}