import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        char[][] cs = new char[h][w];
        for (int i = 0; i < h; i++) {
            cs[i] = in.next().toCharArray();
        }

        int vertical[] = {0, 1, 0, -1};
        int holizontal[] = {-1, 0, 1, 0};
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (cs[i][j] == '#') {
                    boolean ok = false;
                    for (int j2 = 0; j2 < 4; j2++) {
                        int y = i + vertical[j2];
                        int x = j + holizontal[j2];
                        if (y >= 0 && y < h && x >= 0 && x < w && cs[y][x] == '#') {
                            ok = true;
                            break;
                        }
                    }

                    if (!ok) {
                        System.out.println("No");
                        return;
                    }
                }
            }
        }

        System.out.println("Yes");
    }
}