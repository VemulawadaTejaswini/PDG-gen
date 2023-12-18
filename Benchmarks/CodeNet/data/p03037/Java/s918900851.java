import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int N;
    private static int M;
    private static ArrayList<Integer> Li = new ArrayList<>();
    private static ArrayList<Integer> Ri = new ArrayList<>();

    private static void init() {
        Scanner scanner = new Scanner(System.in);

        String header = scanner.nextLine();
        String[] headerItems = header.split(" ");
        N = Integer.parseInt(headerItems[0]);
        M = Integer.parseInt(headerItems[1]);

        for (int gateIndex = 0; gateIndex < M; gateIndex++) {
            String card = scanner.nextLine();
            String[] cardItems = card.split(" ");
            int L = Integer.parseInt(cardItems[0]);
            int R = Integer.parseInt(cardItems[1]);

            Li.add(L);
            Ri.add(R);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        init();
        // logic
        logic();
    }

    private static void logic() {
        int[] cards = new int[N];

        for (int gateIndex = 0; gateIndex < M; gateIndex++) {
            int L = Li.get(gateIndex);
            int R = Ri.get(gateIndex);
            for (int cardIndex = L - 1; cardIndex < R; cardIndex++) {
                ++cards[cardIndex];
            }
        }

        int numberOfAllGateCard = 0;
        for (int cardIndex = 0; cardIndex < N; cardIndex++) {
            if (cards[cardIndex] == M) {
                ++numberOfAllGateCard;
            }
        }

        System.out.println(numberOfAllGateCard);
    }
}
