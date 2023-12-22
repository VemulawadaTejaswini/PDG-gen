import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int m = in.nextInt();
        int[] row = new int[h];
        int[] col = new int[w];
        ArrayList<Pair> list = new ArrayList<>(m);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<m; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            list.add(new Pair(x, y));
            row[x]++;
            col[y]++;
            map.put(convert(x, y, w), 1);
        }
        int max = 0, colIndex = 0, rowIndex = 0, colMax = 0, rowMax = 0;
        for(int i=0; i<h; i++) {
            if(row[i] > rowMax) {
                rowIndex = i;
                rowMax = row[i];
            }
        }
        for(int i=0; i<w; i++) {
            if(col[i] > colMax) {
                colMax = col[i];
                colIndex = i;
            }
        }
        for(int i=0; i<w; i++) {
            if(map.containsKey(convert(rowIndex, i, w)))
                max = Math.max(max, row[rowIndex] + col[i] - 1);
            else
                max = Math.max(max, row[rowIndex] + col[i]);
        }
        for(int i=0; i<h; i++) {
            if(map.containsKey(convert(i, colIndex, w)))
                max = Math.max(max, row[i] + col[colIndex] - 1);
            else
                max = Math.max(max, row[i] + col[colIndex]);
        }
        System.out.println(max);
        in.close();
    }

    static int convert(int i, int j, int w) {
        return i*w + j;
    }

    static class Pair {
        Integer i, j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        Pair() {}

        public int hashCode() {
            return 31 * i.hashCode() + j.hashCode();
        }
    }
}