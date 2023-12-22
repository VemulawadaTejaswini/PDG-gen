import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] rate = new int[N];
        for (int i = 0; i < N; i++) {
            rate[i] = sc.nextInt();
        }
        int[] order = new int[N];
        int tmp = rate[0];
        boolean buy = true;
        for (int i = 1; i < rate.length; i++) {
            if (tmp < rate[i]) {
                if (buy) {
                    order[i-1] = 1;
                    buy = false;
                } else {
                    continue;
                }
            } else if (rate[i] < tmp) {
                if (!buy) {
                    order[i-1] = 2;
                    buy = true;
                } else {
                    continue;
                }
            } else {
                continue;
            }
            tmp = rate[i];
        }
        long money = 1000l;
        long stock = 0l;
        for (int i = 0; i < order.length; i++) {
            if (order[i] == 1) {
                int cost = rate[i];
                stock = money/cost;
                money -= stock*cost;
            } else if (order[i] == 2) {
                int cost = rate[i];
                money += cost*stock;
                stock = 0;
            } else {
                continue;
            }
        }
        if (!buy) {
            int cost = rate[order.length-1];
            money += cost*stock;
        }
        System.out.println(money);
    }

}
