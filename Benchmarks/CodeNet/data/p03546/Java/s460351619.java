import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int magic[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                magic[j][i] = sc.nextInt();
            }
        }

        int mins[] = new int[10];
        boolean fix[] = new boolean[10];
        Arrays.fill(mins, 114514);
        mins[1] = 0;

        int cnt = 1;
        int nowp = 1;
        while (cnt < 10) {
            fix[nowp] = true;
            int minc = 114514;
            int nextp = 0;
            for (int i = 0; i < 10; i++) {
                if (!fix[i]) {
                    mins[i] = Math.min(mins[i], mins[nowp] + magic[nowp][i]);
                    if (mins[i] <= minc) {
                        minc = mins[i];
                        nextp = i;
                    }
                }
            }

            nowp = nextp;
            cnt++;
        }

        int sum = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int a = sc.nextInt();
                if (a != -1) {
                    sum += mins[a];
                }
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
