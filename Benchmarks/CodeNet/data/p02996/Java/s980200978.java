import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();

        Work[] works = new Work[N];
        for (int i = 0; i < N; i++) {
            final int A = Integer.valueOf(sc.next());
            final int B = Integer.valueOf(sc.next());
            works[i] = new ABC131_D().new Work(A, B);
        }

        boolean finished = true;
        int workTime = 0;

        Arrays.sort(works);

        for (Work work : works) {
            workTime += work.a;
            if (workTime > work.b) {
                finished = false;
                break;
            }
        }
        
        System.out.println(finished ? "Yes" : "No");
    }

    private class Work implements Comparable<Work> {
        public int a;
        public int b;

        public Work(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Work o) {
            return b - o.b;
        }

        public String toString() {
            return "a: " + a + ", b: " + b;
        }
    }
}
