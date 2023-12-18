import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int cell[][] = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                cell[i][j] = 0;
            }
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            cell[a][b] = 1;
        }
        sc.close();

        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            count.put(i, 0);
        }

        int countSaver[][] = new int[h][w - 2];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w - 2; j++) {
                countSaver[i][j] = 0;
                for (int k = j; k < j + 3; k++) {
                    countSaver[i][j] += cell[i][k];
                }
            }
        }
        
        int nineSaver[][] = new int[h - 2][w - 2];
        for (int i = 0; i < h - 2; i++) {
            for (int j = 0; j < w - 2; j++) {
                int nineSum = 0;
                if (i == 0) {
                    for (int k = 0; k < i + 3; k++) {
                        nineSum += countSaver[k][j];
                    }
                    nineSaver[0][j] = nineSum;
                } else {
                    nineSaver[i][j] = nineSaver[i - 1][j] - countSaver[i - 1][j] + countSaver[i + 2][j];
                    nineSum = nineSaver[i][j];
                }
                if (count.containsKey(nineSum)) {
                        count.put(nineSum, count.get(nineSum) + 1);
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(count.get(i));
        }
    }
}
