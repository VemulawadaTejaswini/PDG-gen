
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author takumi.oodaira
 */
final class Main {

    public static final int FIELD_SIZE = 10;

    private Main() {
    }

    public static void main(final String[] argv) throws IOException {
        final BufferedReader inputReader =
                new BufferedReader(new InputStreamReader(System.in));
        int[] field = new int[FIELD_SIZE * FIELD_SIZE];
        Arrays.fill(field, 0);
        while (true) {
            final String input = inputReader.readLine();
            if (input == null) {
                break;
            }
            String[] inputs = input.split(",");
            switch (Integer.parseInt(inputs[2])) {
                case 1:
                    field = paintS(field, Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
                    break;
                case 2:
                    field = paintM(field, Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
                    break;
                case 3:
                    field = paintL(field, Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));
                    break;
                default:
                    break;
            }
        }
        int whiteCount = 0;
        int colorMax = 0;
        for (int i : field) {
            if (i == 0) {
                whiteCount++;
            } else if (i > colorMax) {
                colorMax = i;
            }
        }
        System.out.println(whiteCount);
        System.out.println(colorMax);
    }

    private static void printField (int[] field) {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(field[j + i * 10]);
            }
            System.out.println();
        }
    }

    private static int getIndex(final int x, final int y) {
        return x + y * FIELD_SIZE;
    }

    private static int[] paintS(int[] field, final int x, final int y) {
        field[getIndex(x, y)]++;
        if (x - 1 >= 0) {
            field[getIndex(x - 1, y)]++;
        }
        if (y - 1 >= 0) {
            field[getIndex(x, y - 1)]++;
        }
        if (x + 1 < FIELD_SIZE) {
            field[getIndex(x + 1, y)]++;
        }
        if (y + 1 < FIELD_SIZE) {
            field[getIndex(x, y + 1)]++;
        }
        return field;
    }

    private static int[] paintM(int[] field, final int x, final int y) {
        field = paintS(field, x, y);
        if (x - 1 >= 0 && y - 1 >= 0) {
            field[getIndex(x - 1, y - 1)]++;
        }
        if (x - 1 >= 0 && y + 1 < FIELD_SIZE) {
            field[getIndex(x - 1, y + 1)]++;
        }
        if (x + 1 < FIELD_SIZE && y - 1 >= 0) {
            field[getIndex(x + 1, y - 1)]++;
        }
        if (x + 1 < FIELD_SIZE && y + 1 < FIELD_SIZE) {
            field[getIndex(x + 1, y + 1)]++;
        }
        return field;
    }

    private static int[] paintL(int[] field, final int x, final int y) {
        field = paintM(field, x, y);
        if (x - 2 >= 0) {
            field[getIndex(x - 2, y)]++;
        }
        if (y - 2 >= 0) {
            field[getIndex(x, y - 2)]++;
        }
        if (x + 2 < FIELD_SIZE) {
            field[getIndex(x + 2, y)]++;
        }
        if (y + 2 < FIELD_SIZE) {
            field[getIndex(x, y + 2)]++;
        }
        return field;
    }
}