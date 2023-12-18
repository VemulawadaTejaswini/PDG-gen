import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();
        boolean[][] array = new boolean[height][width];

        for (int i = 0; i < height; i++)
            for (int i1 = 0; i1 < width; i1++)
                array[i][i1] = scanner.next().equals("#");

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[0].length; y++) {
                if (array[x][y]) {
                    boolean temp = false;
                    try {
                        if (array[x - 1][y]) temp = true;
                    } catch (ArrayIndexOutOfBoundsException e) {}
                    try {
                        if (temp || array[x + 1][y]) temp = true;
                    } catch (ArrayIndexOutOfBoundsException e) {}
                    try {
                        if (temp || array[x][y - 1]) temp = true;
                    } catch (ArrayIndexOutOfBoundsException e) {}
                    try {
                        if (temp || array[x][y + 1]) temp = true;
                    } catch (ArrayIndexOutOfBoundsException e) {}

                    if (!temp) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}