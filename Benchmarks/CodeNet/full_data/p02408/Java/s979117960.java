import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Card> cards = new ArrayList<>();
        IntStream.range(0, 13).forEach(i -> cards.add(new Card('S', i + 1)));
        IntStream.range(0, 13).forEach(i -> cards.add(new Card('H', i + 1)));
        IntStream.range(0, 13).forEach(i -> cards.add(new Card('C', i + 1)));
        IntStream.range(0, 13).forEach(i -> cards.add(new Card('D', i + 1)));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.lines().forEach(s -> {
            List<String> list = Arrays.stream(s.split(" "))
                    .collect(Collectors.toList());
            Card card = new Card(list.get(0).charAt(0), Integer.valueOf(list.get(1)));
            cards.remove(card);
        });

        cards.forEach(c -> System.out.println(c.toString()));
    }
}

class Card extends Object {

    private char suit;

    private int number;

    public Card(char suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Card)) {
            return false;
        } else {
            Card card = (Card) object;
            return this.suit == card.suit && this.number == card.number;
        }
    }

    @Override
    public int hashCode() {
        return suit * 100 + number;
    }

    @Override
    public String toString() {
        return String.valueOf(suit) + " " + String.valueOf(number);
    }
}