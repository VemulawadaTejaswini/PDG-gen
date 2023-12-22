import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            IntStream.range(1, n + 1)
                    .filter(i -> i % 3 == 0 || String.valueOf(i).contains("3"))
                    .forEach(i -> System.out.print(" " + i));

            System.out.println();
        }
    }
}