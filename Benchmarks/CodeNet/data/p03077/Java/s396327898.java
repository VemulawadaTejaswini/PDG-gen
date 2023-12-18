import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final int COUNT = 5;

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long n = Long.parseLong(reader.readLine());

            long[] caps = new long[COUNT];
            for (int i = 0; i < COUNT; ++i) {
                caps[i] = Long.parseLong(reader.readLine());
            }
            eval(n, caps);
        }
    }

    public static void eval(long n, long[] caps) {
        System.out.println(cost(n, Arrays.stream(caps).min().getAsLong()) + caps.length);
    }

    public static long cost(long n, long cap) {
        return (long) Math.ceil(n / cap);
    }

}
