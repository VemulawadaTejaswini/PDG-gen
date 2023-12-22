import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if ((h | w) == 0)
                break;
            Set<String> set = new HashSet<String>();
            char[][] d = new char[h][w];
            for (int i = 0; i < h; i++) {
                d[i] = sc.next().toCharArray();
            }
            int max = 0;
            String ans = "";
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
                    int[] dy = { -1, -1, 0, 1, 1, 1, 0, -1 };
                    int x = j;
                    int y = i;
                    for (int k = 0; k < 8; k++) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(d[y][x]);
                        int nx = x;
                        int ny = y;
                        while (true) {
                            nx = nx + dx[k];
                            ny = ny + dy[k];
                            if (nx >= w) {
                                nx = 0;
                            } else if (nx < 0) {
                                nx = w - 1;
                            }
                            if (ny >= h) {
                                ny = 0;
                            } else if (ny < 0) {
                                ny = h - 1;
                            }
                            if (nx == x && ny == y) {
                                break;
                            }
                            sb.append(d[ny][nx]);
                            String str = sb.toString();
                            if (set.contains(str)) {
                                if (str.length() > max) {
                                    max = str.length();
                                    ans = str;
                                } else if (max == str.length()) {
                                    if (str.compareTo(ans) < 0) {
                                        ans = str;
                                    }
                                }
                            } else
                                set.add(str);
                        }
                    }
                }
            }
            System.out.println(ans.equals("") ? 0 : ans);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}