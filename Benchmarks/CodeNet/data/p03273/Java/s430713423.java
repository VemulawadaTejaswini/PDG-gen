import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String[][] a = new String[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                a[i][j] = sc.next();
            }
        }

        ArrayList<Integer> row = new ArrayList<>();
        for (int i = 0; i < H; i++){
            boolean f = true;
            for (int j = 0; j < W; j++) {
                if (a[i][j].equals("#")) {
                    f = false;
                }
            }
            if (f) row.add(i);
        }

        ArrayList<Integer> column = new ArrayList<>();
        for (int j = 0; j < W; j++){
            boolean f = true;
            for (int i = 0; i < H; i++) {
                if (a[i][j].equals("#")) {
                    f = false;
                }
            }
            if (f) column.add(j);
        }

        for (int i = 0; i < H; i++) {
            if (row.contains(i)) continue;

            for (int j = 0; j < W; j++) {
                if (column.contains(j)) continue;

                System.out.print(a[i][j]);
            }
            System.out.println("¥n");
        }
    }

}