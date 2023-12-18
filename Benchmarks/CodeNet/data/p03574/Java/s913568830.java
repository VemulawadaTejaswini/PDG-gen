import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int[][] array = Arrays.stream(new int[height])
                .mapToObj(i -> scanner.next().chars().map(c -> c == '#' ? -1 : 0).toArray())
                .toArray(int[][]::new);

        int xLength = array.length - 1;
        for (int x = 0; x <= xLength; x++) {
            int yLength = array[x].length - 1;
            for (int y = 0; y <= yLength; y++) {
                if (array[x][y] == -1)
                    continue;

                boolean flag1 = false;
                boolean flag2 = false;

                if (x != 0) {
                    if (array[x - 1][y] == -1) array[x][y]++;
                    flag1 = true;
                } if (x != xLength) {
                    if (array[x + 1][y] == -1) array[x][y]++;
                    flag2 = true;
                } if (y != 0) {
                    if (array[x][y - 1] == -1) array[x][y]++;
                    if (flag1 && array[x - 1][y - 1] == -1) array[x][y]++;
                    if (flag2 && array[x + 1][y - 1] == -1) array[x][y]++;
                } if (y != yLength) {
                    if (flag1 && array[x - 1][y + 1] == -1) array[x][y]++;
                    if (flag2 && array[x + 1][y + 1] == -1) array[x][y]++;
                    if (array[x][y + 1] == -1) array[x][y]++;
                }
            }
        }

        Arrays.stream(array)
                .map(a -> Arrays.stream(a)
                        .mapToObj(b -> b == 0 ? "." : b == -1 ? "#" : Integer.toString(b))
                        .collect(Collectors.joining()))
                .forEach(System.out::println);
    }
}