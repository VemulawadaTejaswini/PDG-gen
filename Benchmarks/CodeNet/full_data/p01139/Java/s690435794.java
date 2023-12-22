import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w == 0 && h == 0) {
                break;
            }
            char[][] field = new char[h][];
            for (int i = 0; i < h; i++) {
                field[i] = sc.next().toCharArray();
            }
            HashMap<Character, Boolean> counts = new HashMap<>();
            int whiteCount = 0;
            int blackCount = 0;
            char current = (char)('W' + 1);
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (field[i][j] == '.') {
                        Result result = new Result();
                        check(i, j, current, field, result);
                        if (result.white && !result.black) {
                            counts.put(current, true);
                        } else if (!result.white && result.black) {
                            counts.put(current, false);
                        }
                        current = (char)(current + 1);
                    }
                }
            }
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (counts.containsKey(field[i][j])) {
                        if (counts.get(field[i][j])) {
                            whiteCount++;
                        } else {
                            blackCount++;
                        }
                    }
                }
            }
            sb.append(blackCount).append(" ").append(whiteCount).append("\n");
        }
        System.out.print(sb);
    }
    
    static void check(int r, int c, char mark, char[][] field, Result result) {
        if (field[r][c] == 'W') {
            result.white = true;
            return;
        }
        if (field[r][c] == 'B') {
            result.black = true;
            return;
        }
        if (field[r][c] != '.') {
            return;
        }
        field[r][c] = mark;
        if (r != 0) {
            check(r - 1, c, mark, field, result);
        }
        if (r < field.length - 1) {
            check(r + 1, c, mark, field, result);
        }
        if (c > 0) {
            check(r, c - 1, mark, field, result);
        }
        if (c < field[r].length - 1) {
            check(r, c + 1, mark, field, result);
        }
    }
    
    static class Result {
        boolean white = false;
        boolean black = false;
    }
}
