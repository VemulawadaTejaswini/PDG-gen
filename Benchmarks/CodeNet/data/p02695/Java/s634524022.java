import java.util.*;

public class Main {

    static int n;
    static int m;
    static int q;

    static int array[];
    static int ABCD[][];

    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        q = sc.nextInt();

        ABCD = new int[q][4];

        for (int i = 0; i < q; i++) {
            ABCD[i][0] = sc.nextInt();
            ABCD[i][1] = sc.nextInt();
            ABCD[i][2] = sc.nextInt();
            ABCD[i][3] = sc.nextInt();
        }

        array = new int [n];

        dfs(0, 1);

        System.out.println(max);

        sc.close();
    }

    public static void dfs(int depth, int min) {
        for (int i = min; i < m + 1; i++) {
            array[depth] = i;
            if (depth + 1 == n) {
                int value = 0;
                for (int j = 0; j < q; j++) {
                    if (array[ABCD[j][1] - 1] - array[ABCD[j][0] - 1] == ABCD[j][2]) {
                        value += ABCD[j][3];
                    }
                }
                if (value > max) {
                    max = value;
                }
            } else {
                dfs(depth + 1, i);
            }
        }
    }

}