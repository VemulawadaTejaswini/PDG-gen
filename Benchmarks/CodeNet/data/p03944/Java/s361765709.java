
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();

        int[] x = new int[N];
        int[] y = new int[N];
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }

        Supplier<Stream<Integer>> rangeN = () -> IntStream.range(0, N).boxed();
        Stream<Integer> sorted1 = rangeN.get().filter(i -> a[i] == 1).map(i -> x[i]).sorted(Comparator.reverseOrder());
        Stream<Integer> sorted2 = rangeN.get().filter(i -> a[i] == 2).map(i -> x[i]).sorted();
        Stream<Integer> sorted3 = rangeN.get().filter(i -> a[i] == 3).map(i -> y[i]).sorted(Comparator.reverseOrder());
        Stream<Integer> sorted4 = rangeN.get().filter(i -> a[i] == 4).map(i -> y[i]).sorted();

        int minX = sorted1.findFirst().orElse(0);
        int maxX = sorted2.findFirst().orElse(W);
        int minY = sorted3.findFirst().orElse(0);
        int maxY = sorted4.findFirst().orElse(H);

        // System.out.println(String.format("%d %d %d %d", minX, maxX, minY, maxY));
        int width = maxX - minX;
        int height = maxY - minY;

        if (height < 0 || width < 0) {
            System.out.println(0);
        } else {
            System.out.println(width * height);
        }
    }
}