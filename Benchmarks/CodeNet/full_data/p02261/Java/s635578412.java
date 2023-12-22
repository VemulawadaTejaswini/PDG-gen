import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Card> original = Arrays.stream(scanner.nextLine().split(" "))
                .map(card -> new Card(card))
                .collect(Collectors.toList());

        List<Card> cards1 = original.stream().collect(Collectors.toList());
        List<Card> cards2 = original.stream().collect(Collectors.toList());

        Function<Integer, Integer> getSortNumber = a -> cards1.get(a).getNumber();
        bubbleSort(cards1, getSortNumber);
        System.out.println(cards1.stream().map(c -> c.toString()).collect(Collectors.joining(" ")));
        System.out.println("Stable");

        selectionSort(cards2, a -> cards2.get(a).getNumber());
        System.out.println(cards2.stream().map(c -> c.toString()).collect(Collectors.joining(" ")));

        if (IntStream.range(0, original.size())
                .anyMatch(index -> !(cards1.get(index).equals(cards2.get(index))))) {
            System.out.println("Not stable");
        } else {
            System.out.println("Stable");
        }
    }

    private static int bubbleSort(List a, Function<Integer, Integer> getSortNumber) {
        int swapCount = 0;
        int length = a.size();

        // N-1 + N-2 + ... + 1 = (N^2 - N)/2 回
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                // 左隣の方が大きいならば、swapする
                if (getSortNumber.apply(j-1) > getSortNumber.apply(j)) {
                    Collections.swap(a, j, j-1);
                    swapCount++;
                }
            }
        }
        return swapCount;
    }

    private static int selectionSort(List a, Function<Integer, Integer> getSortNumber) {
        int length = a.size();
        int swapCount = 0;

        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (getSortNumber.apply(j) < getSortNumber.apply(minIndex)) {
                    minIndex = j;
                }
            }

            if (getSortNumber.apply(i) > getSortNumber.apply(minIndex)) {
                Collections.swap(a, i, minIndex);
                swapCount++;
            }
        }
        return swapCount;
    }

    private static class Card {
        private char suit;
        private int number;

        public Card (String pair) {
            suit = pair.charAt(0);
            number = Integer.parseInt(pair.substring(1));
        }

        public int getSuit() {
            return suit;
        }

        public int getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return String.valueOf(suit) + number;
        }

        @Override
        public boolean equals(Object card) {
            if (!(card instanceof Card)) super.equals(card);

            Card cardObj = (Card) card;
            return this.suit == cardObj.getSuit() && this.number == cardObj.getNumber();
        }
    }
}

