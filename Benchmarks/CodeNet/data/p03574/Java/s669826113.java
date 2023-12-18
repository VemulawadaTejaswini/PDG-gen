import java.util.*;

public class Main {

    private static int sweepOne(List<char[]> board, int i, int j) {
        if (i < 0 || i >= board.size() || j < 0 || j >= board.get(i).length
                || board.get(i)[j] == '.')
            return 0;

        if (board.get(i)[j] == '#')
            return 1;

        return 0;
    }

    private static int sweep(List<char[]> board, int i, int j) {
        int left = sweepOne(board, i - 1, j);
        int right = sweepOne(board, i + 1, j);
        int up = sweepOne(board, i, j + 1);
        int down = sweepOne(board, i, j - 1);
        int a = sweepOne(board, i - 1, j - 1);
        int b = sweepOne(board, i + 1, j + 1);
        int c = sweepOne(board, i - 1, j + 1);
        int d = sweepOne(board, i + 1, j - 1);

        return left + right + up + down + a + b + c + d;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        List<char[]> board = new ArrayList<>();
        String[] msg = new String[row];
        for (int i = 0; i < row; i++) {
            String tmp = sc.nextLine();
            board.add(tmp.toCharArray());
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board.get(i)[j] == '.') {
                    board.get(i)[j] = (char)(sweep(board, i, j) + 48);
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(board.get(i)[j]);
            }
            System.out.println();
        }
    }

}