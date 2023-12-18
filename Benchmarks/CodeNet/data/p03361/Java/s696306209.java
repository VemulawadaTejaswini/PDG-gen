import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = Integer.parseInt(scanner.next());
        int W = Integer.parseInt(scanner.next());
        scanner.nextLine();

        char[][] field = new char[H][W];
        for (int i = 0; i < H; i++) {
            char[] tmp = scanner.nextLine().toCharArray();
            field[i] = tmp;
        }
        scanner.close();

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int y = 0; y < H; y++) {
            for (int x = 0; x < W; x++) {
                if (field[y][x] != '#') continue;

                int filledCount = 0;

                // 上下左右に#がいるか
                for (int i = 0; i < 4; i++) {
                    if (y + dy[i] < 0 || x + dx[i] < 0) continue;
                    if (y + dy[i] >= H || x + dx[i] >= W) continue;

                    char cell = field[y + dy[i]][x + dx[i]];
                    if (cell == '#') filledCount++;
                }

                if (filledCount == 0) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}
