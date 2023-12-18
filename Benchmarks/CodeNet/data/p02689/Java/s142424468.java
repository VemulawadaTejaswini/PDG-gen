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

        int path[][] = new int[M][2];
        for (int i = 0; i < M; i++) {
            path[i][0] = s.nextInt();
            path[i][1] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            int flag = 0;
            for (int j = 0; j < M; j++) {
                if (path[j][0] == i) {
                    if (H[i] <= H[path[i][1]]) {
                        flag = 1;
                        break;
                    }
                }
                if (path[j][1] == i) {
                    if (H[i] <= H[path[i][0]]) {
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