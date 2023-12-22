import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Card[] cards = new Card[n];
        String[] input;
        for (int i = 0; i < n; i++) {
            input = sc.nextLine().split(" ");
            cards[i] = new Card(input[0], Integer.parseInt(input[1]), i);
        }

        quickSort(cards, 0, n - 1);

        StringBuilder sb = new StringBuilder("");
        if (isStable(cards)) sb.append("Stable\n");
        else sb.append("Not stable\n");

        for (int i = 0; i < n; i++) {
            sb.append(cards[i].getSuit()).append(" ").append(cards[i].getNum()).append("\n");
        }
        System.out.print(sb);

    }

    public static int partition(Card[] cards, int left, int right) {
        Card x = cards[right];
        int i = left;
        Card temp;
        for (int j = left; j < right; j++) {
            if (cards[j].getNum() <= x.getNum()) {
                temp = cards[i];
                cards[i] = cards[j];
                cards[j] = temp;
                i++;
            }
        }
        temp = cards[i];
        cards[i] = cards[right];
        cards[right] = temp;
        return i;
    }

    public static void quickSort(Card[] cards, int left, int right) {
        if (left < right) {
            int pivot = partition(cards, left, right);
            quickSort(cards, left, pivot - 1);
            quickSort(cards, pivot + 1, right);
        }
    }

    public static boolean isStable(Card[] cards) {
        for (int i = 1; i < cards.length; i++) {
            if (cards[i - 1].getNum() == cards[i].getNum() && cards[i - 1].getInitialIndex() > cards[i].getInitialIndex()) {
                return false;
            }
        }
        return true;
    }
}

class Card {
    private String suit;
    private int num;
    private int initialIndex;

    public Card(String suit, int num, int initialIndex) {
        this.suit = suit;
        this.num = num;
        this.initialIndex = initialIndex;
    }

    public String getSuit() {
        return suit;
    }

    public int getNum() {
        return num;
    }

    public int getInitialIndex() {
        return initialIndex;
    }
}