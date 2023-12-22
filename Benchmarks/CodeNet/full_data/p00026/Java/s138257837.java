import java.util.*;

class Main {

    static int [][] paper;

    static void pour (int x, int y, int size) {
        paper[x][y] += 1;
        if (x > 0)  paper[x-1][y] += 1;
        if (x < 9)  paper[x+1][y] += 1;
        if (y > 0)  paper[x][y-1] += 1;
        if (y < 9)  paper[x][y+1] += 1;

        if (size >= 2) {
            if (x > 0 && y > 0) paper[x-1][y-1] += 1;
            if (x > 0 && y < 9) paper[x-1][y+1] += 1;
            if (x < 9 && y > 0) paper[x+1][y-1] += 1;
            if (x < 9 && y < 9) paper[x+1][y+1] += 1;
        }

        if (size == 3) {
            if (x > 1)  paper[x-2][y] += 1;
            if (x < 8)  paper[x+2][y] += 1;
            if (y > 1)  paper[x][y-2] += 1;
            if (y < 8)  paper[x][y+2] += 1;
        }
    }

    static void calculate () {
        int max = 0;
        int empty = 0;

        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (paper[i][j] == 0) {
                    empty += 1;
                } else if (paper[i][j] > max) {
                    max = paper[i][j];
                }
            }
        }

        System.out.println(empty);
        System.out.println(max);
    }

    public static void main (String [] args) {

        paper = new int[10][10];

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String [] line = sc.nextLine().split(",");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int size = Integer.parseInt(line[2]);

            pour(x, y, size);
        }

        calculate();

    }
}