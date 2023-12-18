import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] hw = new char[h][w];
        for (int i = 0; i < h; i++) {
            hw[i] = sc.next().toCharArray();

        }
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        boolean isSuccess = false;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (hw[i][j] == '.') continue;
                isSuccess = true;
                for (int k = 0; k < 4; k++) {

                    int ni = i + dx[k];
                    int nj = j + dy[k];
                    if (ni < 0 || h <= ni) continue;
                    if (nj < 0 || w <= nj) continue;
                    if (hw[ni][nj] == '#') {
                        isSuccess = true;
                        break;
                    } else {
                        isSuccess = false;

                    }
                }

                if (!isSuccess) {
                    break;
                }
            }
            if (!isSuccess) {
                break;
            }
        }

        if (isSuccess) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}