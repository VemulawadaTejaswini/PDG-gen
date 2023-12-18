import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static int process(TestCase testCase) {
        int N = testCase.N;
        List<Integer> A = testCase.A;

        List<Integer> differences = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            final int diff = i - A.get(i);
            differences.add(diff);
        }

        differences.sort(Integer::compareTo);

        int mid = N / 2;
        final int midDiff = differences.get(mid);

        List<Integer> uniqDiffs = new ArrayList<>(new TreeSet<>(differences));

        return Math.min(sadness(differences, midDiff), sadness(differences, uniqDiffs.get(uniqDiffs.size() / 2)));

//        Set<Integer> set = new TreeSet<>(differences);
//
//        return set.stream()
//                .mapToInt(diff->sadness(differences, diff))
//                .min()
//                .orElseThrow(()->new IllegalStateException("Set is empty"));
    }

    private static int sadness(Collection<Integer> differences, int midDiff) {
        return differences.stream()
                .mapToInt(i -> Math.abs(i - midDiff))
                .sum();
    }

    // Util func

    public static void main(String[] args) {
        TestCase testCase = readFromInput();

        final int result = process(testCase);

        output(result);
    }

    private static TestCase readFromInput() {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            A.add(sc.nextInt());
        }

        sc.close();
        return new TestCase(N, A);
    }

    private static void output(int result) {
        System.out.println(result);
    }

    public static class TestCase {
        final int N;
        final List<Integer> A;

        public TestCase(int N, List<Integer> A) {
            this.N = N;
            this.A = A;
        }
    }

}
