import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long k;
        try (Scanner cin = new Scanner(System.in)) {
            k = cin.nextLong();
        }

        long count = 0L;
        long[] cur = new long[] {1L, 1L};
        for (long l = 1; count < k; l++) {
            long denomi = Long.toString(l + 1).chars().map(x -> x - '0').sum();
            long[] next = new long[] {l + 1, denomi};
            if (compareFractions(cur, next) <= 0) {
                System.out.println(l);
                count++;
            }
            cur = next;
        }
    }

    static int compareFractions(long[] a, long[] b) {
        long ac = a[0] * b[1];
        long bc = b[0] * a[1];
        return Long.compare(ac, bc);
    }
}