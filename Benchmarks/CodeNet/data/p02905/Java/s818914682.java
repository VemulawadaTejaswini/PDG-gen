import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.IntToLongFunction;
import java.util.function.LongUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

class Main {
    public static void main(String[] args) {
        int n = 0;
        List<Integer> A = null;
        boolean scansucceed = false;
        try (Scanner scanner = new Scanner(System.in)) {
            n = Integer.parseInt(scanner.nextLine());
            String line = scanner.nextLine();
            String[] linearray = line.split(" ");
            List<Integer> tmp = Arrays.stream(linearray).mapToInt(Integer::parseInt).boxed()
                    .collect(Collectors.toList());
            A = new CopyOnWriteArrayList<>(tmp);
            scansucceed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!scansucceed)
            System.exit(0);
        long result = LongStream.range(0, ((long) n) * (n - 1) / 2).parallel().map(new PairIndex2Lcm(A)).reduce(0L,
                (x, y) -> (x + y) % 998244353L);
        System.out.println(result);
    }
}

class PairIndex2Lcm implements LongUnaryOperator {

    private final List<Integer> A;

    PairIndex2Lcm(List<Integer> A) {
        this.A = A;
    }

    private static int gcd(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        } else {
            return gcd(b, r);
        }
    }

    private static long lcm(int a, int b) {
        return ((long) a) / gcd(a, b) * b;
    }

    @Override
    public long applyAsLong(long index) {
        /*
         * (i>j) |-> 1+2+...+(i-1)+j = i*(i-1)/2+j の逆関数. i*(i-1)/2 <= index なる最大のiを見つける
         */
        int i = 0;
        for (;; i++) {
            int nexti = i + 1;
            int x = nexti * (nexti - 1) / 2;
            if (x > index)
                break;
        }
        int j = (int) (index - ((long) i) * (i - 1) / 2);
        int a = A.get(i);
        int b = A.get(j);
        return lcm(a, b);
    }
}