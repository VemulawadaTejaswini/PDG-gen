import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rank = new int[9];
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp >= 3200) {
                tmp = 3200;
            }
            rank[tmp/400]++;
        }

        int colors = 0;
        for (int i = 0; i < rank.length - 1; i++) {
            if (rank[i] != 0) {
                colors++;
            }
        }
        int color_min = (colors == 0)? 1: colors;
        int color_max = colors + rank[8];
        System.out.println(color_min + " " + color_max);
    }
}