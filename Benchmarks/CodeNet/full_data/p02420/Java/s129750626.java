import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] S = sc.next().split("");
            List<String> cards = new ArrayList<>(Arrays.asList(S));

            if ("-".equals(cards.get(0))) break;

            int m = Integer.parseInt(sc.next());
            for (int i = 0; i < m; i++) {
                int s = Integer.parseInt(sc.next());

                for (int j = 0; j < s; j++) {
                    String tmp = cards.get(0);
                    cards.remove(0);
                    cards.add(tmp);
                }
            }
            cards.forEach(System.out::print);
            System.out.println();
        }
    }
}