import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Task[] t = new Task[N];
        for (int i = 0; i < N; ++i) {
            t[i] = new Task();
            t[i].a = sc.nextLong();
            t[i].b = sc.nextLong();
        }
        Arrays.sort(t, new MyComparator());
        long agg = 0;
        for (int i = 0; i < N; ++i) {
            agg += t[i].a;
            if (agg > t[i].b) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    static class MyComparator implements Comparator<Task> {
        @Override
        public int compare(Task t1, Task t2) {
            return t1.b < t2.b || (t1.b == t2.b && t1.a < t2.a) ? -1 : 1;
        }
    }
    static class Task {
        long a, b;
    }
}
