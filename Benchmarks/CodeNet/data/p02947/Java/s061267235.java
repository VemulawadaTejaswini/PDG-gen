import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        S[] s = new S[n];
        for (int i = 0; i < n; i++) {
            s[i] = new S(sc.next());
        }
        Arrays.sort(s);
        long c = 0L;
        long cur = 0L;
        for (int i = 1 ; i < n; i++) {
            if (s[i - 1].compareTo(s[i]) == 0) {
                cur++;
            } else if (cur != 0L) {
                c += nC2(cur);
                cur = 0L;
            }
        }
        if (cur != 0L) {
            c += nC2(cur);
        }
        System.out.println(c);
    }
    private static long nC2(long n) {
        return factorial(n + 1L) / factorial(n - 1L) / 2;
    }
    private static long factorial(long a) {
        long res = 1L;
        for (long i = 1L; i <= a; i++) {
            res *= i;
        }
        return res;
    }
    private static class S implements Comparable<S> {
        private char[] array;
        private S(String s) {
            this.array = s.toCharArray();
            Arrays.sort(array);
        }
        @Override
        public int compareTo(S o) {
            for (int i = 0; i < 10; i++) {
                int res = Character.compare(this.array[i], o.array[i]);
                if (res != 0) {
                    return res;
                }
            }
            return 0;
        }
    }
}
