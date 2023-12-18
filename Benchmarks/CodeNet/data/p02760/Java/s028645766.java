import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();
        Cell[][] bingo = new Cell[3][3];
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                int number = scanner.nextInt();
                bingo[y][x] = new Cell(number);
                map.put(number, String.format("%s_%s", y, x));
            }
        }

        int execCount = scanner.nextInt();

        for (int i = 0; i < execCount; i++) {
            int hitNumber = scanner.nextInt();
            String point = map.get(hitNumber);
            if (point != null) {
                String[] yx = point.split("_");
                int y = Integer.parseInt(yx[0]);
                int x = Integer.parseInt(yx[1]);
                bingo[y][x].read = true;
            }
        }

        System.out.println(result(bingo) ? "Yes" : "No");
    }

    static boolean result(Cell[][] bingo) {
        for (int y = 0; y < 3; y++) {
            boolean ok = true;
            for (int x = 0; x < 3; x++) {
                if (!bingo[y][x].read) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return true;
            }
        }
        for (int x = 0; x < 3; x++) {
            boolean ok = true;
            for (int y = 0; y < 3; y++) {
                if (!bingo[y][x].read) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                return true;
            }
        }
        if (bingo[0][0].read && bingo[1][1].read && bingo[2][2].read) {
            return true;
        }
        if (bingo[2][0].read && bingo[1][1].read && bingo[0][2].read) {
            return true;
        }
        return false;
    }

    static class Cell {
        int number;
        boolean read = false;

        public Cell(int number) {
            this.number = number;
        }
    }
}