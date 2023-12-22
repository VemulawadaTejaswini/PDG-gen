import java.util.Scanner;

public class Main {
private static int[][]daoyu;
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (x == 0 && y == 0) break;
            for(int judge_x = 0;judge_x<x;judge_x++) {
            	for(int judge_y = 0;judge_y<y;judge_y++) {
            		daoyu[judge_x][judge_y]=input.nextInt();
            		}
            }
        for (int i = 0; i < daoyu.length; i++)
            for (int j = 0; j < daoyu[i].length; j++)
                if (daoyu[i][j] == 1) {
                    count++;
                    lj(i, j);
                }
        System.out.println(count);
    }
    }
    static void lj(int i, int j) {
        daoyu[i][j] = 2;
        if (i - 1 >= 0 && daoyu[i - 1][j] == 1)
            lj(i - 1, j);
        if (i + 1 < daoyu.length && daoyu[i + 1][j] == 1)
            lj(i + 1, j);
        if (j - 1 >= 0 && daoyu[i][j - 1] == 1)
            lj(i, j - 1);
        if (j + 1 < daoyu[i].length && daoyu[i][j + 1] == 1)
            lj(i - 1, j + 1);
    }
}
