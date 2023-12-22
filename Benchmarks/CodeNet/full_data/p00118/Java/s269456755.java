import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static final char DONE_FLAG = 'd';
    static final int[] dx = new int[]{-1, 0, 1, 0};
    static final int[] dy = new int[]{0, -1, 0, 1};

    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while((str = r.readLine()) != null) {
            int[] maxXY = getXY(str);
            int maxY = maxXY[0];
            int maxX = maxXY[1];
            if (maxX == 0 && maxY == 0) { break; }

            char[][] farm = getFarmArray(maxX, maxY, r);

            int answer = 0;
            for (int i = 0; i < maxX; i++) {
                for (int j = 0; j < maxY; j++) {
                    char target = farm[i][j];
                    if (target == DONE_FLAG) { continue; }

                    depthFirstSearch(target, maxX, maxY, farm, i, j);
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }

    private static void depthFirstSearch(char target, int maxX, int maxY, char[][] farm, int x, int y) throws Exception {
        // ????´¢??????????????°????????????
        if (farm[x][y] == DONE_FLAG) {
            throw new Exception("Invalid Input!");
        }
        farm[x][y] = DONE_FLAG;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            if (nx < 0 || nx >= maxX) { continue; } // ??????????????´??????????´¢?????????
            int ny = y + dy[k];
            if (ny < 0 || ny >= maxY) { continue; } // ??????????????´??????????´¢?????????

            // ???????¨??????????????????????????????????????????????
            if (target != DONE_FLAG && farm[nx][ny] == target) {
                depthFirstSearch(target, maxX, maxY, farm, nx, ny);
            }
        }
    }

    private static char[][] getFarmArray(int maxX, int maxY, BufferedReader r) throws IOException {
        char[][] farm = new char[maxX][maxY];
        for (int j = 0; j < maxY; j++) {
            String line = r.readLine();
            for (int i = 0; i < maxX; i++) {
                farm[i][j] = line.charAt(i);
            }
        }
        return farm;
    }

    private static int[] getXY(String line) throws IOException {
        String[] xyStr = line.split(" ");
        int[] xy = new int[xyStr.length];
        for (int i = 0; i < xyStr.length; i++) {
            xy[i] = Integer.parseInt(xyStr[i]);
        }
        return xy;
    }
}