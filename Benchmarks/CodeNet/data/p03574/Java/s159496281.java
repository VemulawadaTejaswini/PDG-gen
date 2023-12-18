import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c[][] = new int[a + 2][b + 2];

        for (int i = 0; i < a; i++) {
            String str = scanner.next();
            String[] s = str.split("", 0);
            for (int i1 = 0; i1 < b; i1++) {
                if (s[i1].equals("#")) {
                    c[i + 1][i1 + 1] = 1;
                } else {
                    c[i + 1][i1 + 1] = 0;
                }
            }
        }

        int result[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int i1 = 0; i1 < b; i1++) {
                if (c[i + 1][i1 + 1] == 1) {
                    System.out.print("#");
                } else {
                    result[i][i1] += c[i][i1];
                    result[i][i1] += c[i][i1 + 1];
                    result[i][i1] += c[i][i1 + 2];
                    result[i][i1] += c[i + 1][i1];
                    result[i][i1] += c[i + 1][i1 + 1];
                    result[i][i1] += c[i + 1][i1 + 2];
                    result[i][i1] += c[i + 2][i1];
                    result[i][i1] += c[i + 2][i1 + 1];
                    result[i][i1] += c[i + 2][i1 + 2];
                    System.out.print(result[i][i1]);
                }
            }
            System.out.println();
        }
    }
}