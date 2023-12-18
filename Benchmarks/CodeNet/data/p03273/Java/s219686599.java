import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        String[][] list = new String[h][w];
        for (int i = 0; i < h; i++) {
            String[] tmp = sc.next().split("");
            for (int j = 0; j < w; j++) {
                list[i][j] = tmp[j];
            }
        }

        List<Integer> excludeW = new ArrayList<>();
        for (int i = 0; i < w; i++) {
            boolean isBlack = false;
            for (int j = 0; j < h; j++) {
                if (list[j][i].equals("#")) {
                    isBlack = true;
                    continue;
                }
            }
            if (!isBlack) excludeW.add(i);
        }

        List<Integer> excludeH = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            boolean isBlack = false;
            for (int j = 0; j < w; j++) {
                if (list[i][j].equals("#")) {
                    isBlack = true;
                    continue;
                }
            }
            if (!isBlack) excludeH.add(i);
        }

        for (int i = 0; i < h; i++) {
            if (!excludeH.contains(i)) {
                for (int j = 0; j < w; j++) {
                    if (!excludeW.contains(j)) {
                        System.out.print(list[i][j]);
                    }
                }
                System.out.println("");
            }
        }
    }
}