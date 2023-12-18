import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Shop> shops = new PriorityQueue<>(n, (x, y) -> {
            if (x.price == y.price) {
                return 0;
            } else if (x.price > y.price) {
                return 1;
            } else {
                return -1;
            }
        });

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Shop shop = new Shop(a, b);
            shops.add(shop);
        }

        long ans = 0;
        long tmp = 0;
        while (tmp < m) {
            Shop s = shops.poll();
            if (m - tmp >= s.stock) {
                ans += s.price * s.stock;
                tmp += s.stock;
            } else {
                ans += s.price * (m - tmp);
                tmp += m - tmp;
            }
        }
        System.out.println(ans);
    }
}

class Shop {
    public long price;
    public long stock;

    Shop(long price, long stock) {
        this.price = price;
        this.stock = stock;
    }
}
