import java.util.*;

public class Main {
    public int n, m;
    public long[] goodsPrices;

    public static void main(String[] args) {
        (new Main()).run();
    }

    // 実体
    public void run() {
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt(); // 品物数
        this.m = sc.nextInt(); // 割引券枚数
        this.goodsPrices = new long[this.n];

        for (int i = 0; i < n; i++) {
            this.goodsPrices[i] = sc.nextInt();
        }

        System.out.println(this.buy(0, this.m, 0, -1));
    }

    public long buy(int idx, int couponCount, long currentAmount, long currentMin) {
        if (currentMin != -1 && currentMin <= currentAmount) {
            return -1;
        }
        if (idx == this.n) {
            return currentAmount;
        }

        long nextAmount = -1;

        for (int c = 0; c <= couponCount; c++) {
            long amount = buy(idx + 1, couponCount - c, currentAmount + discount(this.goodsPrices[idx], c), currentMin);
            if (amount == -1) {
                continue;
            }
            if (nextAmount == -1 || amount < nextAmount) {
                nextAmount = amount;
            }
        }

        return nextAmount;
    }

    // 割引ロジック
    public long discount(long price, int couponCount) {
        if (couponCount == 0) {
            return price;
        }
        return (long) (Math.floor(price / Math.pow(2, couponCount)));
    }
}