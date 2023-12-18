import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    private static final int COUNT = 5;

    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int[] waitTime = new int[COUNT];
            for (int i = 0; i < COUNT; ++i) {
                waitTime[i] = Integer.parseInt(reader.readLine());
            }
            eval(waitTime);
        }
    }

    public static void eval(int[] waitTime) {
        int[] r = Arrays.stream(waitTime)
                .boxed()
                .sorted(Comparator.comparing(i -> cost(i)))
                .mapToInt(Integer::intValue)
                .toArray();
        int u = Arrays.stream(r, 0, r.length - 1).map(i -> upToMulOf10(i)).sum();
        int res = u + r[r.length - 1];
        System.out.println(res);
    }

    public static int cost(int num) {
        return upToMulOf10(num) - num;
    }

    public static int upToMulOf10(int num) {
        int d = (num % 10);
        return d == 0 ? num : num + (10 - d);
    }

}
