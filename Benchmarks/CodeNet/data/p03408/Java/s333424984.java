import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Map<String, Integer> blueCards = inputCount(cin);
        Map<String, Integer> redCards = inputCount(cin);

        int max = 0;
        for (String card : blueCards.keySet()) {
            int value = blueCards.get(card) - redCards.getOrDefault(card, 0);
            if (max < value) max = value;
        }
        System.out.println(max);
    }

    static Map<String, Integer> inputCount(Scanner cin) {
        int n = cin.nextInt();
        String[] cards = new String[n];
        for (int i = 0; i < n; i++) {
            cards[i] = cin.next();
        }
        Map<String, Integer> result = new HashMap<>();
        if (cards.length == 0)
            return result;

        Arrays.sort(cards);
        String s = cards[0];
        int count = 0;
        for (String card: cards) {
            if (card.equals(s)) {
                count++;
            } else {
                result.put(s, count);
                count = 1;
                s = card;
            }
        }
        result.put(s, count);
        return result;

    }
}