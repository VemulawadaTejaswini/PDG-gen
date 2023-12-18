import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Work> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Work(a, b));
        }
        sc.close();

        Collections.sort(list);
//        System.out.println(list);

        long ans = 0;
        for (int i = m; i > 0; i--) {
            if (list.size() == 0) {
                break;
            }
            Work work = list.remove(0);
            if (work.a <= i) {
                ans += work.b;
            }
        }
        System.out.println(ans);
    }

    public static class Work implements Comparable<Work> {
        int a;
        int b;

        public Work(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Work o) {
            if (o.b - b != 0) {
                return o.b - b;
            } else {
                return o.a - a;
            }
        }

        @Override
        public String toString() {
            return "a=" + a + ", b=" + b;
        }
    }
}
