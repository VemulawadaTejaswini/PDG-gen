import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(firstLine[0]), K = Integer.parseInt(firstLine[1]), Q = Integer.parseInt(firstLine[2]);
        int[] players = new int[N];

        for (int i = 0; i < Q; i++)
            players[scanner.nextInt() - 1]++;

        for (Integer p : players) {
            if (p + K - Q <= 0) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
