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
        Integer[] p = new Integer[n];
        Integer[] q = new Integer[n];
        for (int i = 0; i < n; ++i) p[i] = sc.nextInt();
        for (int i = 0; i < n; ++i) q[i] = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; ++i) arr[i] = i + 1;
        int P = 0, Q = 0, cnt = 1;
        do {
            if (Arrays.equals(arr, p)) P = cnt;
            if (Arrays.equals(arr, q)) Q = cnt;
            ++cnt;
        } while (nextPermutation(arr));

        System.out.println(Math.abs(P - Q));
    }
}