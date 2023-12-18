import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int pairCount = 0;
        for (int i = n - 1; i >= 0; i--) {
            if(i > 0) {
                int min = Math.min(cards[i], cards[i - 1]);
                if (min > 0) {
                    cards[i] -= min;
                    cards[i - 1] -= min;
                    pairCount += min;
                }
            }

            int count = cards[i] / 2;
            cards[i] = count;
            pairCount += count;
        }

        System.out.println(pairCount);
    }
}
