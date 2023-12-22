import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] future = new int[n];
        for (int i = 0; i < n; i++) {
            future[i] = sc.nextInt();
        }

        int currentDay = 1;
        int nextDay = 0;
        M m = new M();

        while (currentDay <= n && (nextDay = m.getNextDay(future, currentDay)) != -1) {
            int price = future[nextDay - 1];

            if (m.isBuy) m.buy(price);
            else m.sell(price);

            currentDay = nextDay + 1;
        }

        System.out.println(m.cash);
    }


    static class M {
        public int cash = 1000;
        public int stocks = 0;
        public boolean isBuy = true;

        public int getNextDay(int[] future, int currentDay) {
            if (isBuy) return this.getNextBuyDay(future, currentDay);
            else return this.getNextSellDay(future, currentDay);
        }

        private int getNextSellDay(int[] future, int currentDay) {
            int current = future[currentDay - 1];
            int nextDay = currentDay;

            for (int i = currentDay; i < future.length; i++) {
                int next = future[i];
                if (current <= next) {
                    current = next;
                    nextDay = i + 1;
                } else {
                    break;
                }
            }
            return nextDay;
        }

        private int getNextBuyDay(int[] future, int currentDay) {
            int current = this.cash / future[currentDay - 1];
            int nextDay = currentDay;

            for (int i = currentDay; i < future.length; i++) {
                int next = this.cash / future[i];
                if (current <= next) {
                    current = next;
                    nextDay = i + 1;
                } else {
                    break;
                }
            }

            if (nextDay == future.length) return -1;
            else return nextDay;
        }

        public void buy(int price) {
            int number = this.cash / price;
            this.cash -= price * number;
            this.stocks += number;
            this.isBuy = false;
        }

        public void sell(int price) {
            this.cash += price * this.stocks;
            this.stocks = 0;
            this.isBuy = true;
        }
    }
}
