import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        long k = reader.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = reader.nextLong();
        }
        System.out.println(
                LongStream.range(0, k + 1)
                        .parallel()
                        .map(el -> Arrays.stream(a)
                                .parallel()
                                .map(a_i -> el ^ a_i)
                                .sum())
                        .max()
                        .getAsLong());
        reader.close();
    }
}