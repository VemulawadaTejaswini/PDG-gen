import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h][w];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            c[i] = s.toCharArray();
        }

        int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (c[y][x] == '.') {
                    int b = 0;
                    for (int i = 0; i < 8; i++) {
                        int yy = y + dy[i];
                        int xx = x + dx[i];
                        if (yy < 0 || yy >= h || xx < 0 || xx >= w) {
                            continue;
                        }
                        if (c[yy][xx] == '#') {
                            b++;
                        }
                    }
                    c[y][x] = (char)('0' + b);
                }
            }
            System.out.println(new String(c[y]));
        }
    }
}