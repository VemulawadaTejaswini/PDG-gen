import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int h, w;
        String[][] mat;
        List<Integer> showRowIndex = new LinkedList<>();
        List<Integer> showColIndex = new LinkedList<>();
        // 読み込み
        try(Scanner sn = new Scanner(System.in)) {
            h = sn.nextInt();
            w = sn.nextInt();
            mat = new String[h][];
            for (int i = 0; i < h; i++)
                mat[i] = sn.next().split("");
        }
        // 表示する行を求める
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                if (mat[i][j]=="#") {
                    showRowIndex.add(i);
                    break;
                }
        // 表示する列を求める
        for (int i = 0; i < w; i++)
            for (int j: showRowIndex)
                if (mat[j][i]=="#") {
                    showColIndex.add(i);
                    break;
                }
        // 表示
        for (int i: showRowIndex) {
            for (int j: showColIndex) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
