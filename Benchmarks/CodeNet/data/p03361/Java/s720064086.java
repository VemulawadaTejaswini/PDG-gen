import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int H = Integer.parseInt(line.split(" ")[0]);
        int W = Integer.parseInt(line.split(" ")[1]);

        String[][] craymore = new String[H][W];
        int count = 0;
        while (sc.hasNext()) {
            craymore[count] = sc.nextLine().split("");
            count++;
        }

        sc.close();
        boolean isCan = true;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (craymore[i][j].equals(".")) {
                    continue;
                }
                boolean isCan2 = false;
                for (int k = -1; k <= 1; k++) {
                    // System.out.println("k is [" + k + "]");
                    if (i + k < 0 || i + k >= H) {
                        continue;
                    }
                    for (int l = -1; l <= 1; l++) {
                        // System.out.println("l is [" + l + "]");
                        if (j + l < 0 || j + l >= W || k == l || k == -1 * l) {
                            continue;
                        }
                        // System.out.println("origin points : (" + i + ", " + j + ")");
                        // System.out.println("check pattern : (" + (int) (k + i) + ", " + (int) (l + j)
                        // + ")");
                        if (craymore[k + i][l + j].equals("#")) {
                            isCan2 = true;
                            break;
                        }
                    }
                    if (isCan2) {
                        break;
                    }
                }
                if (!isCan2) {
                    isCan = false;
                    break;
                }
            }
            if (!isCan) {
                break;
            }
        }
        if (isCan) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}