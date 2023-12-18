import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        long cnt = Stream.of(a).distinct().count();
        if (cnt == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
