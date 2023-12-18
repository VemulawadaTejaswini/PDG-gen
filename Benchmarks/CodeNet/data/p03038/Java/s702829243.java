import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] A = new long[n];
        ArrayList<Change<Long, Long>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            list.add(new Change<Long, Long>(sc.nextLong(), sc.nextLong()));
        }

        sc.close();

        Arrays.sort(A);
        list.sort(Comparator.comparing(Change::getC, Comparator.reverseOrder()));

        for (int i = 0; i < m; i++) {
            long b = list.get(i).getB();
            long c = list.get(i).getC();
            int idx = 0;
            for (int j = 0; j < b; j++) {
                if (A[idx] < c) {
                    A[idx] = c;
                    idx = 0;
                    Arrays.sort(A);
                } else {
                    idx++;
                }
            }
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
        }

        System.out.println(sum);

    }

    public static class Change<b, c> {
        public long b;
        public long c;

        public Change(long b, long c) {
            this.b = b;
            this.c = c;
        }

        public long getB() {
            return b;
        }

        public long getC() {
            return c;
        }
    }
}