import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        final int N = Integer.parseInt(br.readLine());
        int[] array = Stream.of(br.readLine().split(" "))
                                   .mapToInt(Integer::parseInt)
                                   .toArray();
        Arrays.sort(array);
        int result = 0;
        for (int i = 0; i < array.length; i += 2) {
            result += Math.min(array[i], array[i + 1]);
        }
        System.out.println(result);
    }
}