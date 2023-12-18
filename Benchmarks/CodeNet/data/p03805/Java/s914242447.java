import java.util.*;

public class Main {

    static <T extends Comparable<? super T>> boolean nextPermutation(T[] sequence) {
        int first = getFirst(sequence);
        if (first == -1) return false;
        int toSwap = sequence.length - 1;
        while (sequence[first].compareTo(sequence[toSwap]) >= 0) --toSwap;
        swap(sequence, first++, toSwap);
        toSwap = sequence.length - 1;
        while (first < toSwap) swap(sequence, first++, toSwap--);
        return true;
    }

    static <T extends Comparable<? super T>> int getFirst(T[] sequence) {
        for (int i = sequence.length - 2; i >= 0; --i)
            if (sequence[i].compareTo(sequence[i + 1]) < 0) return i;
        return -1;
    }

    static <T extends Comparable<? super T>> void swap(T[] sequence, int i, int j) {
        T tmp = sequence[i];
        sequence[i] = sequence[j];
        sequence[j] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; ++i) Arrays.fill(graph[i], 0);
        for (int i = 0; i < m; ++i) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            graph[from][to] = 1;
            graph[to][from] = 1;
        }

        Integer[] perm = new Integer[n];
        for (int i = 0; i < n; ++i) perm[i] = i;
        int res = 0;
        do {
            if (perm[0] != 0) continue;
            boolean flag = true;
            for (int i = 0; i < n - 1; ++i) {
                if (graph[perm[i]][perm[i + 1]] == 0) flag = false;
            }
            if (flag) ++res;
        } while (nextPermutation(perm));

        System.out.println(res);
    }
}