import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] input = new char[h][w];
        for (int i = 0; i < h; i++) {
            char[] row = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                input[i][j] = row[j];
            }
        }
        char[][] result = new char[2 * h][w];
        for (int i = 0; i < 2 * h; i++) {
            for (int j = 0; j < w; j++) {
                int index = (i + 2) / 2 - 1;
                result[i][j] = input[index][j];
                System.out.printf("%c", result[i][j]);
            }
            System.out.println();
        }
    }
}
