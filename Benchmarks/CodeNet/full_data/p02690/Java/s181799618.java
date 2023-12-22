import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        Map<Integer, Pair> map = new HashMap<>();
        for (int i = -900; i <= 900; i++) {
            for (int j = -900; j <= 900; j++) {
                map.put(i * i * i * i * i - j * j * j * j * j, new Pair(i, j));
            }
        }
        Pair pair = map.getOrDefault(X, new Pair(-999, -999));
        if(pair.a == -999) throw new RuntimeException("aaa");
        System.out.println(pair.a);
        System.out.println(pair.b);
    }

    class Pair {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
