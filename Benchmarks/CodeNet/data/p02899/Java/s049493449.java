import java.util.*;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int N = in.nextInt();
        Pair[] pairs = new Pair[N];
        for (int i = 0; i < N; i++) {
            pairs[i] = new Pair(i + 1, in.nextInt());
        }
        Arrays.sort(pairs);
        StringBuilder sb = new StringBuilder();
        sb.append(pairs[0].i);
        for (int i = 1; i < pairs.length; i++) {
            sb.append(" " + pairs[i].i);
        }

        System.out.println(sb.toString());
    }

    static class Pair implements Comparable<Pair> {
        int i;
        int a;

        Pair(int i, int a) {
            this.i = i;
            this.a = a;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(a, o.a);
        }
    }
}
