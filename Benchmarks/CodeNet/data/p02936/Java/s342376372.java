import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] arg) {
        Main m = new Main();
        m.run();
        m.close();
    }

    private Scanner sc;

    private Main() {
        sc = new Scanner(System.in);
    }
    private void close() {
        sc.close();
    }

    private void run() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        tree = IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toArray(List[]::new);
        visited = new boolean[n];
        val = new int[n];
        IntStream.range(0, n - 1).forEach(i -> {
            int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
            tree[a].add(b);
            tree[b].add(a);
        });
        inputs = new int[n];
        IntStream.range(0, q).forEach(i -> inputs[sc.nextInt() - 1] += sc.nextInt());

        add(0, 0);

        outAll(val);
    }

    private void add(int index, int parentValue) {
        val[index] += parentValue + inputs[index];
        visited[index] = true;
        for (int next : tree[index]) {
            if (!visited[next]) add(next, val[index]);
        }
    }

    List<Integer>[] tree;
    boolean[] visited;
    int[] val;
    int[] inputs;

    private <T> void outAll(T[] a) {
        System.out.print(a[0]);
        Arrays.stream(a).skip(1).forEach(o -> {
            System.out.print(' ');
            System.out.print(o);
        });
    }

    private void outAll(int[] a) {
        System.out.print(a[0]);
        Arrays.stream(a).skip(1).forEach(o -> {
            System.out.print(' ');
            System.out.print(o);
        });
    }
}
