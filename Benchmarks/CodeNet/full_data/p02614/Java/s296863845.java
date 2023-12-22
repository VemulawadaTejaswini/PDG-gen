import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int K = scanner.nextInt();

        int map[][] = new int[W][H];
        int blackCnt = 0;
        int patternCnt = 0;

        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                map[i][j] = -1;
            }
        }

        scanner.nextLine();
        for (int i = 0; i < H; i++) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            for (int j = 0; j < W; j++) {
                map[j][i] = chars[j] == '.' ? 0 : 1;
                blackCnt += map[j][i];
            }
        }


        for (int xBit = 0; xBit < (1 << W); xBit++) {
            for (int yBit = 0; yBit < (1 << H); yBit++) {
                int bBlackCnt = blackCnt;
                HashSet<String> searched = new HashSet<>();
                for (int x = 0; x < W; x++) {
                    if ((xBit & (1 << x)) == 1) {
                        for (int y = 0; y < H; y++) {
                            if (map[x][y] == 1 && !searched.contains(x + "," + y)) {
                                bBlackCnt--;
                                searched.add(x + "," + y);
                            }
                        }
                    }
                }

                for (int y = 0; y < H; y++) {
                    if ((yBit & (1 << y)) == 1) {
                        for (int x = 0; x < W; x++) {
                            if (map[x][y] == 1 && !searched.contains(x + "," + y)) {
                                bBlackCnt--;
                                searched.add(x + "," + y);
                            }
                        }
                    }
                }

                if (bBlackCnt == K) {
                    patternCnt++;
                }
            }
        }

        System.out.println(patternCnt);
    }
}
