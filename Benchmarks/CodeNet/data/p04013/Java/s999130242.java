import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * Created by hirai on 2016/08/30.
 */
public class Main {

    private static long ans = 0;
    private static int expect_avg;
    private static int array_size;
    private static int[] array;
    private static Calc calc = new Calc();

    public static final void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        expect_avg = scanner.nextInt();

        array = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            array[i] = scanner.nextInt();
        }
        //System.out.println("start");
        calc.accept(new Arg());

        System.out.println(ans);
    }

    private static class Arg {
        int start = 0;
        long sum = 0;
        int cnt = 0;
    }

    private static class Calc implements Consumer<Arg> {

        @Override
        public void accept(Arg arg) {
            final int start = arg.start;
            final long sum = arg.sum;
            final int cnt = arg.cnt;
            for (int i = start; i < array_size; i++) {
                final int tmp = array[i];
                final int next = cnt + 1;
                final long nextSum = sum + tmp;
                if (nextSum / next == expect_avg) {
                    if(nextSum % next == 0) {
                        ans++;
                    }
                }
                Arg nextArg = new Arg();
                nextArg.start = i + 1;
                nextArg.sum = nextSum;
                nextArg.cnt = next;
                calc.accept(nextArg);
            }
        }
    }
}
