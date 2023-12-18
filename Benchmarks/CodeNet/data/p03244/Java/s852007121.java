import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] u1 = new int[n / 2], u2 = new int[n / 2], count1 = new int[100001], count2 = new int[100001];
        for (int i = 0; i < n / 2; i++) {
            count1[u1[i] = scanner.nextInt()]++;
            count2[u2[i] = scanner.nextInt()]++;
        }

        int max1 = IntStream.range(0, 100001)
                .boxed()
                .max(Comparator.comparingInt(i -> count1[i]))
                .orElse(0);
        int max2 = IntStream.range(0, 100001)
                .boxed()
                .max(Comparator.comparingInt(i -> count2[i]))
                .orElse(0);
        if (max1 == max2) {
            int next1 = IntStream.range(0, 100001)
                    .filter(i -> i != max1)
                    .boxed()
                    .max(Comparator.comparingInt(i -> count1[i]))
                    .orElse(0);
            int next2 = IntStream.range(0, 100001)
                    .filter(i -> i != max2)
                    .boxed()
                    .max(Comparator.comparingInt(i -> count2[i]))
                    .orElse(0);
            System.out.println(n - Math.max(count1[next1] + count2[max2], count1[max1] + count2[next2]));
        } else {
            System.out.println(n - count1[max1] - count2[max2]);
        }
    }
}