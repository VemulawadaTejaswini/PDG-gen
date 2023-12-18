import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        char[][] a = new char[h + 2][w + 2];
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < w + 2; i++) {
            a[0][i] = '#';
        }
        for (int i = 1; i < h + 1; i++) {
            String line = sc.nextLine().replace("\n", "");
            a[i][0] = '#';
            for (int j = 1; j < w + 1; j++) {
                a[i][j] = line.charAt(j - 1);
                if (a[i][j] == '#') queue.add(String.valueOf(i) + "," + String.valueOf(j));
            }
            a[i][w + 1] = '#';
        }
        for (int i = 0; i < w + 2; i++) {
            a[h + 1][i] = '#';
        }
        sc.close();

        int[][] counter = new int[h + 2][w + 2];
        for (int i =  0; i < h + 2; i++) {
            for (int j = 0; j < w + 2; j++) {
                counter[i][j] = 0;
            }
        }

        String dark;
        int counterMax = 0;
        while ((dark = queue.poll()) != null) {
            String[] pos = dark.split(",");
            int operate = 0;
            int x = Integer.parseInt(pos[0]);
            int y = Integer.parseInt(pos[1]);
            if (a[x - 1][y] == '.') {
                counter[x - 1][y] = counter[x][y] + 1;
                operate =  1;
                a[x - 1][y] = '#';
                queue.add(String.valueOf(x - 1) + "," + String.valueOf(y));
            }
            if (a[x + 1][y] == '.') {
                counter[x + 1][y] = counter[x][y] + 1;
                operate =  1;
                a[x + 1][y] = '#';
                queue.add(String.valueOf(x + 1) + "," + String.valueOf(y));
            }
            if (a[x][y - 1] == '.') {
                counter[x][y - 1] = counter[x][y] + 1;
                operate =  1;
                a[x][y - 1] = '#';
                queue.add(String.valueOf(x) + "," + String.valueOf(y - 1));
            }
            if (a[x][y + 1] == '.') {
                counter[x][y + 1] = counter[x][y] + 1;
                operate =  1;
                a[x][y + 1] = '#';
                queue.add(String.valueOf(x) + "," + String.valueOf(y + 1));
            }
            if (counterMax < counter[x][y]) counterMax = counter[x][y];
        }
        System.out.println(counterMax);
    }
}
