

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static class Can implements Comparable<Can> {
        long a;
        long b;
        public Can() {
            this.a = 0;
            this.b = 0;
        }
        public Can(long a, long b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Can can = (Can) o;
            return a == can.a &&
                    b == can.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }

        @Override
        public int compareTo(Can o) {
            if (this.a < o.a) {
                return -1;
            } else if (this.a > o.a) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Can[] cans = new Can[n];
        for (int i = 0; i < n; ++i) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            cans[i] = new Can(a, b);
        }
        Arrays.sort(cans);
        int buy = 0;
        long money = 0;
        int i = 0;
        while (buy < m) {
            int currentBuy = (int)Math.min(m - buy, cans[i].b);
            money += currentBuy * cans[i].a;
            buy += currentBuy;
            ++i;
        }
        System.out.println(money);

    }

}
