import java.io.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(
            br.lines().skip(1)
                .map(s -> Stream.of(s.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray())
                .map(a -> Math.pow(a[0], 2) + Math.pow(a[1],2) == Math.pow(a[2], 2))
                .map(b -> b ? "YES" : "NO")
                .collect(joining("\n")));
    }
}