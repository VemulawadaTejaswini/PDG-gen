import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Integer Cards
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            List<Card> cards = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                long A = sc.nextLong();
                cards.add(new Card(A, 1));
            }

            for (int i = 0; i < M; i++) {
                int B = sc.nextInt();
                long C = sc.nextLong();
                cards.add(new Card(C, B));
            }

            Collections.sort(cards, (o1, o2) -> Long.compare(o2.number, o1.number));

            long sum = 0;
            long count = 0;

            for (Card card : cards) {
                if (count + card.count >= N) {
                    sum += card.number * (N - count);
                    break;
                }

                sum += card.number * card.count;
                count += card.count;
            }

            System.out.println(sum);
        }
    }

    static class Card {

        long number;

        int count;

        public Card(long number, int count) {
            this.number = number;
            this.count = count;
        }

    }

}
