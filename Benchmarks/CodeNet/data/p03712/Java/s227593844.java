import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] data = new char[h][w];
        for (int i = 0; i < h; i++) {
            String tmpStr = sc.next();
            data[i] = tmpStr.toCharArray();
        }

        for (int i = 0; i < h+2; i++) {
            for (int j = 0; j < w+2; j++) {
                if (i == 0 || i == h+1 || j == 0 || j == w+1) {
                    System.out.print('#');
                } else {
                    System.out.print(data[i-1][j-1]);
                }
            }
            System.out.println();
        }
    }
}
