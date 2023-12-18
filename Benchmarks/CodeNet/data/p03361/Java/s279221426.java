import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean ans = true;
        int[][] array = new int[h + 2][w + 2];
        for (int i = 1; i < h + 1; i++) {
            String s = sc.next();
            for (int j = 1; j < w + 1; j++) {
                if (s.charAt(j - 1) == '.') {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (array[i][j] == 1) {
                    if (array[i + 1][j] == 0 && array[i][j+ 1] == 0 && array[i - 1][j] == 0 && array[i][j - 1] == 0) {
                        ans = false;
                    }
                }
            }
        }
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
