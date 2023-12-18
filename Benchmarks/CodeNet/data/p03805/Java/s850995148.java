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
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i) Arrays.fill(matrix[i], 0);
        for (int i = 0; i < m; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }

        Integer[] path = new Integer[n];
        for (int i = 0; i < n; ++i) path[i] = i;
        int res = 0;
        do {
            if (path[0] != 0) continue;

            boolean flag = true;
            for (int i = 0; i < n - 1; ++i) {
                if (matrix[path[i]][path[i+1]] != 1) {
                    flag = false; break;
                }
            }
            if (flag) ++res;

        } while(nextPermutation(path));

        System.out.println(res);
    }
}