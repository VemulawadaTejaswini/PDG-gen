import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int q = stdin.nextInt();
        int[] s = new int[n];
        int[] t = new int[n];
        int[] x = new int[n];
        int[] d = new int[q];
        for (int i = 0; i < n; i++) {
            s[i] = stdin.nextInt();
            t[i] = stdin.nextInt();
            x[i] = stdin.nextInt();
        }
        for (int i = 0; i < q; i++) {
            d[i] = stdin.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            s[i] = Math.max(0, s[i] - x[i]);
            t[i] = Math.max(0, t[i] - x[i]);
        }
        
        TreeSet<Tuple> tuples = new TreeSet<>();
        for (int i = 0; i < q; i++) {
            tuples.add(new Tuple(i, d[i]));
        }
        
        int[] answers = new int[q];
        Arrays.fill(answers, -1);
        int[] sections = IntStream.range(0, n)
                                  .boxed()
                                  .sorted(Comparator.comparingInt(i -> x[i]))
                                  .mapToInt(Integer::intValue)
                                  .toArray();
        for (int section : sections) {
            Tuple from = new Tuple(-1, s[section]);
            Tuple to = new Tuple(-1, t[section]);
            List<Tuple> removals = new ArrayList<>(tuples.subSet(from, to));
            for (Tuple tuple : removals) {
                answers[tuple.i] = x[section];
                tuples.remove(tuple);
            }
        }
        
        for (int answer : answers) {
            System.out.println(answer);
        }
    }

    private static class Tuple implements Comparable<Tuple> {
        private int i;
        private int d;
        
        public Tuple(int i, int d) {
            this.i = i;
            this.d = d;
        }
        
        @Override
        public int compareTo(Tuple o) {
            return Integer.compare(d, o.d);
        }
    }
}
