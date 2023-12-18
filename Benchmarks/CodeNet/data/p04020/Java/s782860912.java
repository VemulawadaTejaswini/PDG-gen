import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        //for (int j = 0; j < n; j++) {
        //    System.out.print(cards[j] + "  ");
        //}
        //System.out.println();

        int pairCount = 0;
        for (int i = 0; i < n; i++) {
            int prevMin = 0, nextMin = 0;
            int prevPair = 0, prevCurrentPair = 0, nextCurrentPair = 0, nextPair = 0;
            if (i > 0) {
                prevMin = Math.min(cards[i - 1], cards[i]);
                prevMin = prevMin > 0 ? prevMin : 0;
                prevPair = (cards[i - 1] - prevMin) / 2;
                prevCurrentPair = (cards[i] - prevMin) / 2;
            } else if(i < n - 1) {
                nextMin = Math.min(cards[i], cards[i + 1]);
                nextMin = nextMin > 0 ? nextMin : 0;
                nextPair = (cards[i + 1] - nextMin) / 2;
                nextCurrentPair = (cards[i] - nextMin) / 2;
            }

            //System.out.println(String.format("prevMin=%d, prevPair=%d, prevCurPair=%d", prevMin, prevPair, prevCurrentPair));
            //System.out.println(String.format("nextMin=%d, nextPair=%d, nextCurPair=%d", nextMin, nextPair, nextCurrentPair));

            int prev = prevMin + prevPair + prevCurrentPair;
            int next = nextMin + nextPair + nextCurrentPair;

            if (prev >= next) {
                cards[i - 1] -= prevMin + prevPair * 2;
                cards[i] -= prevMin + prevCurrentPair * 2;
                pairCount += prev;
            } else if (next > prev) {
                cards[i] -= nextMin + nextCurrentPair * 2;
                cards[i + 1] -= nextMin + nextPair * 2;
                pairCount += next;
            }

            //System.out.println(String.format("[%d] prev = %d, next = %d -> pairCount = %d", i, prev, next, pairCount));
            //for (int j = 0; j < n; j++) {
            //    System.out.print(cards[j] + "  ");
            //}
            //System.out.println();
        }

        System.out.println(pairCount);
    }
}
