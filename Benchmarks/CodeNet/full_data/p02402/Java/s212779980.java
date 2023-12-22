import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String none = sc.nextLine();
        String line = sc.nextLine();
        long[] a = Stream.of(line.split(" ")).mapToLong(Long::parseLong).toArray();
        long max = Arrays.stream(a).max().getAsLong();
        long min = Arrays.stream(a).min().getAsLong();
        long sum = Arrays.stream(a).sum();
        System.out.printf("%d %d %d\n", min, max, sum);
    }
}

