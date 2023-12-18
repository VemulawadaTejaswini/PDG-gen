import java.util.*;

/**
 * 構築問題
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        char[][] ans = solve(A, B);

        System.out.println("100 100");
        for (int i=0; i<100; i++) {
            System.out.println(new String(ans[i]));
        }
    }

    private static char[][] solve(int A, int B) {
        char[][] list = new char[100][100];
        int lineIdx = 0;

        String white10  = "..........";
        String white100 = white10 + white10 + white10 + white10 + white10 + white10 + white10 + white10 + white10 + white10;
        String black10  = "##########";
        String black100 = black10 + black10 + black10 + black10 + black10 + black10 + black10 + black10 + black10 + black10;

        for (int i=0; i<50; i++) {
            list[i]    = white100.toCharArray();
            list[i+50] = black100.toCharArray();
        }
        A--; B--;

        while(B > 50) {
            list[lineIdx] = "#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.".toCharArray();
            lineIdx += 2;
            B   -= 50;
        }
        int posIdx = 0;
        while (B > 0) {
            list[lineIdx][posIdx] = '#';
            B--;
            posIdx += 2;
        }

        lineIdx = 51;
        while(A > 50) {
            list[lineIdx] = ".#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#.#".toCharArray();
            lineIdx += 2;
            A   -= 50;
        }
        posIdx = 0;
        while (A > 0) {
            list[lineIdx][posIdx] = '.';
            A--;
            posIdx += 2;
        }

        return list;
    }
}
