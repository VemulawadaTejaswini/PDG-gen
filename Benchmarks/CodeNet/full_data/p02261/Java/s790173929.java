import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    Scanner sc = new Scanner(System.in);

    class Card implements Comparable<Card> {
        public final String Suit;
        public final int Number;

        public Card(String input) {
            this.Suit = input.substring(0, 1);
            this.Number = Integer.valueOf(input.substring(1, 2));
        }

        @Override
        public int compareTo(Card card) {
            if (this.Number < card.Number) return -1;
            if (this.Number > card.Number) return 1;
            return 0;
        }

        @Override
        public String toString() {
            return this.Suit + String.valueOf(this.Number);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (!(obj instanceof Card)) return false;
            Card c = (Card) obj;
            return this.Suit.equals(c.Suit) && this.Number == c.Number;
        }
    }

    Card[] bubbleSort(Card[] c) {
        int n = c.length;
        for (int i = 0; i < n; i++)
            for (int j = n - 1; j > i; j--) {
                if (c[j - 1].compareTo(c[j]) > 0) {
                    Card tmp = c[j - 1];
                    c[j - 1] = c[j];
                    c[j] = tmp;
                }
            }
        return c;
    }

    Card[] selectionSort(Card[] c) {
        int n = c.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i; j < n; j++) {
                if (c[minIndex].compareTo(c[j]) > 0) {
                    minIndex = j;
                }
            }
            Card tmp = c[i];
            c[i] = c[minIndex];
            c[minIndex] = tmp;
        }
        return c;
    }

    void show(final Card[] xs) {
        if (xs != null) {
            String out =
                    Arrays.stream(xs)
                            .map(Card::toString)
                            .collect(Collectors.joining(" "));
            System.out.println(out);
        }
    }

    void showIsStable(boolean f) {
        System.out.println(f ? "Stable" : "Not stable");
    }

    void solve() {
        // Input
        int n = sc.nextInt();
        Card[] c = new Card[n];
        for (int i = 0; i < n; i++) {
            c[i] = new Card(sc.next());
        }

        // Solve
        Card[] bubble = bubbleSort(c.clone());
        boolean isStableBubble = true;
        Card[] selection = selectionSort(c.clone());
        boolean isStableSelection = Arrays.deepEquals(bubble, selection);

        // Output
        show(bubble);
        showIsStable(isStableBubble);
        show(selection);
        showIsStable(isStableSelection);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}

