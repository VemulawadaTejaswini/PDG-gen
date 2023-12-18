import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[][] a = new String[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().split("");
        }
        for (int i = 0; i < h + 2; i++) {
            StringJoiner sj = new StringJoiner("");
            for (int j = 0; j < w + 2; j++) {
                if (i == 0 || i == h + 1
                        || j == 0 || j == w + 1) {
                    sj.add("#");
                    continue;
                }
                sj.add(a[i - 1][j - 1]);
            }
            System.out.println(sj.toString());
        }
    }

}
