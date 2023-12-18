import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int M = s.nextInt();
        int H[] = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = s.nextInt();
        }
        int path[][] = new int[N][N];
        for (int i = 0; i < M; i++) {
            int A = s.nextInt();
            int B = s.nextInt();
            if (B >= A) {
                path[A - 1][B - 1] = 1;
            } else {
                path[B - 1][A - 1] = 1;
            }

        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            int flag = 0;
            for (int j = 0; j < N; j++) {
                int i_x, j_x = 0;
                if (i < j) {
                    i_x = i;
                    j_x = j;
                } else {
                    i_x = j;
                    j_x = i;
                }
                if (path[i_x][j_x] == 1) {
                    if (H[i] <= H[j]) {
                        System.out.println(i);
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        System.out.println(count);

        s.close();
    }
}