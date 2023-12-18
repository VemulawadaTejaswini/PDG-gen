import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Integer[] cards = new Integer[count];

        for (int i = 0; i < count; i++) {
            cards[i] = sc.nextInt();
        }

        // 降順にする
        Arrays.sort(cards, Collections.reverseOrder());

        int score = 0;
        for (int i = 0; i < cards.length; i++) {
            if (i % 2 == 0) {
                score += cards[i];
            } else {
                score -= cards[i];
            }
        }

        System.out.println(score);
    }
}
