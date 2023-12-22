import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = nums.get(0);
        int m = nums.get(1);
        int[][] a = new int[n][m];
        int[] b = new int[m];
        int[] c = new int[n];

        IntStream.range(0, n).forEach(i -> {
            try {
                List<Integer> ints = Arrays.stream(br.readLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
                IntStream.range(0, m).forEach(j -> {
                    a[i][j] = ints.get(j);
                });
            } catch (IOException e) {
            }
        });

        IntStream.range(0, m).forEach(i -> {
            try {
                int val = Integer.parseInt(br.readLine());
                b[i] = val;
            } catch (IOException e) {
            }
        });

        IntStream.range(0, n).forEach(i -> {
            IntStream.range(0, m).forEach(j -> {
                c[i] += a[i][j] * b[j];
            });
        });
        
        IntStream.range(0, n).forEach(i -> System.out.println(c[i]));
    }
}