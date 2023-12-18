import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        char array[][] = new char[h][w];

        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                array[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (array[i][j] == '#') {
                    System.out.print('#');
                } else {
                    int ans = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            int col = i + k - 1;
                            int row = j + l - 1;
                            if ( col > -1 && col < h) {
                                if (row > -1 && row < w) {
                                    if (array[col][row] == '#') {
                                        ans++;
                                    }
                                }
                            }

                        }
                    }
                    System.out.print(ans);
                }
            }
            System.out.println();
        }

        sc.close();

    }

}