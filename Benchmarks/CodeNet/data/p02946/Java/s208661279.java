import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(IntStream.range(x - k + 1, x + k).mapToObj(Integer::toString).collect(Collectors.joining(" ")));
    }
}
