import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Card[] cards = new Card[n];
        for (int i = 0; i < n; i++) {
            String line = in.readLine();
            String[] split = line.split(" ");
            char suit = split[0].charAt(0);
            int value = Integer.parseInt(split[1]);
            cards[i] = new Card(value, suit, i);
        }
        quicksort(cards, 0, n-1);
        if (isStable(cards)) {
            System.out.println("Stable");
        } else {
            System.out.println("Not stable");
        }
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    private static boolean isStable(Card[] cards) {
        for (int i = 0; i < cards.length-1; i++) {
            if (cards[i].equals(cards[i+1]) && cards[i].originalPosition > cards[i+1].originalPosition) {
                return false;
            }
        }
        return true;
    }

    private static void quicksort(Card[] cards, int l, int r) {
        if (l < r) {
            int q = partition(cards, l, r);
            quicksort(cards, l, q-1);
            quicksort(cards, q+1, r);
        }
    }

    private static int partition(Card[] cards, int l, int r) {
        Card x = cards[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (cards[j].compareTo(x) <= 0) {
                i++;
                Card temp = cards[i];
                cards[i] = cards[j];
                cards[j] = temp;
            }
        }
        cards[r] = cards[i+1];
        cards[i+1] = x;
        return i+1;
    }


}

class Card implements Comparable<Card> {
    private int value;
    private char suit;
    int originalPosition;

    Card(int value, char suit, int originalPosition) {
        this.value = value;
        this.suit = suit;
        this.originalPosition = originalPosition;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(value, o.value);
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    @Override
    public boolean equals(Object obj) {
        Card card = (Card) obj;
        return value == card.value;
    }
}

