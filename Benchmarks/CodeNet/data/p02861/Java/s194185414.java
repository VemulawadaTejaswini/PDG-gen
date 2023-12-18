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

    static class Coordinate {
        int x, y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Coordinate> points = new ArrayList<>();
        for (int i = 0; i < n;++ i) {
            points.add(new Coordinate(sc.nextInt(), sc.nextInt()));
        }

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; ++i) arr[i] = i;

        double sum = 0;
        int cnt = 0;
        do {
            for (int i = 0; i < n - 1; ++i) {
                sum += Math.sqrt(Math.pow(points.get(arr[i]).x - points.get(arr[i+1]).x, 2) +
                        Math.pow(points.get(arr[i]).y - points.get(arr[i+1]).y, 2));
            }
            ++cnt;
        } while(nextPermutation(arr));

        System.out.println(sum / cnt);
    }
}