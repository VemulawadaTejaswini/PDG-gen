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
        int maxL = Integer.MIN_VALUE;
        int minR = Integer.MAX_VALUE;

        for (int gateIndex = 0; gateIndex < M; gateIndex++) {
            int L = Li.get(gateIndex);
            int R = Ri.get(gateIndex);
            maxL = Math.max(maxL, L);
            minR = Math.min(minR, R);
        }

        System.out.println((minR >= maxL) ? minR - maxL + 1 : 0);
    }
}
