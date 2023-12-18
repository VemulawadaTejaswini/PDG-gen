import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int H = scan.nextInt();
        int W = scan.nextInt();
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
            String line = scan.next();
            char[] data = line.toCharArray();
            for (int j = 0; j < W; j++) {
                map[i][j] = data[j];
            }
        }
        int answer = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (map[i][j] == '#') {
                    continue;
                }
                int count = 1;
                for (int k = j - 1; 0 <= k; k--) {
                    if (map[i][k] == '#') {
                        break;
                    }
                    count += 1;
                }
                for (int k = j + 1; k < W; k++) {
                    if (map[i][k] == '#') {
                        break;
                    }
                    count += 1;
                }
                for (int k = i - 1; 0 <= k; k--) {
                    if (map[k][j] == '#') {
                        break;
                    }
                    count += 1;
                }
                for (int k = i + 1; k < H; k++) {
                    if (map[k][j] == '#') {
                        break;
                    }
                    count += 1;
                }
                answer = Math.max(answer, count);
            }
        }
        System.out.println(answer);
    }
}
