import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), m = scanner.nextInt();
        long ans = 0;
        List<Store> list = IntStream.range(0, n).mapToObj(i -> new Store(scanner.nextInt(), scanner.nextInt())).sorted(Comparator.comparingLong(store -> store.a)).collect(Collectors.toList());
        for (Store store : list) {
            if (store.b >= m) {
                System.out.println(ans + store.a * m);
                return;
            }
            m -= store.b;
            ans += store.a * store.b;
        }
    }

    static class Store {
        long a, b;
        Store(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}