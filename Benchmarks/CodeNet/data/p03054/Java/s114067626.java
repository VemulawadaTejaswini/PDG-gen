
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        String s = scanner.next();
        String t = scanner.next();

        boolean canGoOut = false;
        // go up
        canGoOut = willGoOut(s, t, r, h -r + 1, 'U', 'D');
        if (canGoOut) {
            System.out.println("NO");
            return;
        }

        // go down
        canGoOut = willGoOut(s, t, h - r + 1, r, 'D', 'U');
        if (canGoOut) {
            System.out.println("NO");
            return;
        }


        // go left
        canGoOut = willGoOut(s, t, c, w - c + 1, 'L', 'R');
        if (canGoOut) {
            System.out.println("NO");
            return;
        }


        // go right
        canGoOut = willGoOut(s, t, w - c + 1, c,'R', 'L');
        if (canGoOut) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

    }

    public static boolean willGoOut(
            String s, String t, int needMoves, int cancelNeedMoves, char move, char cancelMove
    ) {
        int cancelMoveCount = 0;
        int moveCount = 0;
        int i;
        for (i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == move) {
                break;
            }
            if (t.charAt(i) == cancelMove) {
                ++cancelMoveCount;
            }
        }
        if (cancelMoveCount >= cancelNeedMoves) {
            cancelMoveCount = cancelNeedMoves - 1;
        }
        moveCount -= cancelMoveCount;
        for (; i < s.length(); ++i) {
            if (s.charAt(i) == move) {
                ++moveCount;
                if (moveCount >= needMoves) {
                    return true;
                }
            }
            if (t.charAt(i) == cancelMove) {
                --moveCount;
            }
        }
        return false;
    }
}
