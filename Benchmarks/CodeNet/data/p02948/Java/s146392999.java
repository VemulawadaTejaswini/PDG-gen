import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        AB[] ab = new AB[n];
        for (int i = 0; i < n; i++) {
            ab[i] = new AB(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(ab);
        int[] r = new int[m];
        int c = 0;
        l: for (AB abi : ab) {
            for (int i = m - abi.a; 0 <= i; i--) {
                if (r[i] == 0) {
                    r[i] = abi.b;
                    c++;
                    if (c == n || c == m) {
                        break l;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.stream(r).sum());
    }
    private static class AB implements Comparable<AB> {
        private int a;
        private int b;
        private AB(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public int compareTo(AB o) {
            int ret = Integer.compare(o.b, this.b);
            return (ret == 0) ? Integer.compare(o.a, this.a) : ret;
        }
    }
}
