import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        Map<Long, Pair> map = new HashMap<>();
        for (long i = -1000; i <= 1000; i++) {
            for (long j = -1000; j <= 1000; j++) {
                map.put(i * i * i * i * i - j * j * j * j * j, new Pair(i, j));
            }
        }
        Pair pair = map.getOrDefault(X, new Pair(-9999, -9999));
        if(pair.a == -9999) throw new RuntimeException("aaa");
        System.out.println(pair.a);
        System.out.println(pair.b);
    }

    class Pair {
        long a;
        long b;

        Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }
}