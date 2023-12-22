import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                paper[i][j] = 0;
            }
        }

        while (sc.hasNext()) {
            String S = sc.next();
            int x = Integer.parseInt(S.split(",")[0]);
            int y = Integer.parseInt(S.split(",")[1]);
            int s = Integer.parseInt(S.split(",")[2]);

            switch (s) {
                case 1:
                    paper = smallInk(x, y, paper);
                    break;
                case 2:
                    paper = mediumInk(x, y, paper);
                    break;
                case 3:
                    paper = bigInk(x, y, paper);
                    break;
            }
        }

        int none = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                max = (paper[i][j] > max)? paper[i][j] : max;
                none = (paper[i][j] == 0)? none + 1 : none;
            }
        }
        System.out.println(none);
        System.out.println(max);
    }

    private static int[][] smallInk(int x, int y, int[][] paper) {
        if (x - 1 >= 0) paper[x-1][y]++;
        if (x + 1 < 10) paper[x+1][y]++;
        if (y - 1 >= 0) paper[x][y-1]++;
        if (y + 1 < 10) paper[x][y+1]++;

        return paper;
    }

    private static int[][] mediumInk(int x, int y, int[][] paper) {
        if (x - 1 >= 0) paper[x-1][y]++;
        if (x + 1 < 10) paper[x+1][y]++;
        if (y - 1 >= 0) paper[x][y-1]++;
        if (y + 1 < 10) paper[x][y+1]++;
        if (x - 1 >= 0 && y - 1 >= 0) paper[x-1][y-1]++;
        if (x - 1 >= 0 && y + 1 < 10) paper[x-1][y+1]++;
        if (x + 1 < 10 && y - 1 >= 0) paper[x+1][y-1]++;
        if (x + 1 < 10 && y + 1 < 10) paper[x+1][y+1]++;

        return paper;
    }

    private static int[][] bigInk(int x, int y, int[][] paper) {
        if (x - 1 >= 0) paper[x-1][y]++;
        if (x + 1 < 10) paper[x+1][y]++;
        if (y - 1 >= 0) paper[x][y-1]++;
        if (y + 1 < 10) paper[x][y+1]++;
        if (x - 1 >= 0 && y - 1 >= 0) paper[x-1][y-1]++;
        if (x - 1 >= 0 && y + 1 < 10) paper[x-1][y+1]++;
        if (x + 1 < 10 && y - 1 >= 0) paper[x+1][y-1]++;
        if (x + 1 < 10 && y + 1 < 10) paper[x+1][y+1]++;
        if (x - 2 >= 0) paper[x-2][y]++;
        if (x + 2 < 10) paper[x+2][y]++;
        if (y - 2 >= 0) paper[x][y-2]++;
        if (y + 2 < 10) paper[x][y+2]++;

        return paper;
    }
}