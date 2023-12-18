import java.util.*;

public class Main {
    static class Task {
        public int a, b;

        public Task(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public String toString() {
            return String.format("Task(%d, %d)", this.a, this.b);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Task[] lis = new Task[n];

        for (int i = 0; i < n; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            lis[i] = new Task(a, b);
        }

        Arrays.sort(lis, new Comparator<Task>() {
            public int compare(Task x, Task y) {
                return x.b - y.b;
            }
        });

        int now = 0;
        for (int i = 0; i < n; ++i) {
            now += lis[i].a;
            if (now <= lis[i].b) {
                continue;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
