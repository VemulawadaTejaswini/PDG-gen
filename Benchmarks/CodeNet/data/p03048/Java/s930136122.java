import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Lec1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long cnt = IntStream.range(0, input[3] / input[0] + 1)
                .mapToLong(i -> IntStream.range(0, input[3] / input[1] + 1).filter(j -> {
                    int c = input[3] - i * input[0] - j * input[1];
                    return c >= 0 && c % input[2] == 0;
                }).count())
                .sum();
        System.out.println(cnt);
    }
}
