import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String[] s = new String[H];
        for(int i = 0; i < H; i++) {
            s[i] = sc.next();
        } 
        sc.close();

        System.out.println(RangeFlipFindRoute(H, W, s, 1, 1, 0));
    }
    public static int RangeFlipFindRoute(int H, int W, String[] s, int cur_row, int cur_col, int sum) {
        if (cur_row > H || cur_col > W) {
            return 0;
        }
        if (cur_row == H && cur_col == W) {
            if (isWhite(currCell(s, cur_row, cur_col))) {
                return 0;
            }
            return 1;
        }
        int to_right = 0;
        int to_down = 0;
        if (isWhite(currCell(s, cur_row, cur_col))) {
            if (cur_row == H) {
                return RangeFlipFindRoute(H, W, s, cur_row, cur_col + 1, sum);
            }
            if (cur_col == W) {
                return RangeFlipFindRoute(H, W, s, cur_row + 1, cur_col, sum);
            }
            to_right = RangeFlipFindRoute(H, W, s, cur_row, cur_col + 1, sum);
            to_down = RangeFlipFindRoute(H, W, s, cur_row + 1, cur_col, sum);
            return Math.min(to_right, to_down);
        }
        else {
            int end_row = H;
            int end_col = W;
            for (int i = cur_col + 1; i <= W; i++) {
                if (isWhite(currCell(s, cur_row, i))) {
                    end_col = i - 1;
                    break;
                }
            }
            for (int i = cur_row + 1; i <= H; i++) {
                if (isWhite(currCell(s, i, cur_col))) {
                    end_row = i - 1;
                    break;
                }
            }
            String[] flip = new String[H];
            System.arraycopy(s, 0, flip, 0, s.length);
            FlipSquare(flip, cur_row, end_row, cur_col, end_col);
            if (cur_row == H) {
                return 1 + RangeFlipFindRoute(H, W, s, cur_row, cur_col + 1, sum + 1);
            }
            if (cur_col == W) {
                return 1 + RangeFlipFindRoute(H, W, s, cur_row + 1, cur_col, sum + 1);
            }
            to_right = 1 + RangeFlipFindRoute(H, W, flip, cur_row, cur_col + 1, sum + 1);
            to_down = 1 + RangeFlipFindRoute(H, W, flip, cur_row + 1, cur_col, sum + 1);
            return Math.min(to_right, to_down);
        }
    }
    public static boolean isWhite(String cell) {
        if (cell.charAt(0) == '.') {
            return true;
        }
        return false;
    }
    public static String currCell(String[] s, int row, int col) {
        return s[row-1].substring(col-1, col);
    }
    public static String rightCell(String[] s, int row, int col) {
        return s[row-1].substring(col, col+1);
    }
    public static String downCell(String[] s, int row, int col) {
        return s[row].substring(col-1, col);
    }
    public static void FlipRight(String[] s, int row, int start_col, int end_col) {
        for(int i = start_col; i <= end_col; i++ ) {
            if (isWhite(currCell(s, row, i))) {
                toBlack(s, row, i);
            } else {
                toWhite(s, row, i);
            }
        }
    }
    // public static void FlipDown(String[] s, int start_row, int end_row, int col) {
    //     for(int i = start_row; i <= end_row; i++ ) {
    //         if (isWhite(currCell(s, i, col))) {
    //             toBlack(s, i, col);
    //         } else {
    //             toWhite(s, i, col);
    //         }
    //     }
    // }
    public static void FlipSquare(String[] s, int start_row, int end_row, int start_col, int end_col) {
        for(int i = start_row; i <= end_row; i++ ) {
            FlipRight(s, i, start_col, end_col);
        }
    }
    public static void toBlack(String[] s, int row, int col) {
        s[row-1] = s[row-1].substring(0, col-1) + "#" + s[row-1].substring(col);
    }
    public static void toWhite(String[] s, int row, int col) {
        s[row-1] = s[row-1].substring(0, col-1) + "." + s[row-1].substring(col);
    }
}
