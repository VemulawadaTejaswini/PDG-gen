import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[][] canvas = new char[h + 2][w + 2];
        for (int i = 1; i <= h; i++) {
            canvas[i] = ('.' + scanner.next() + '.').toCharArray();
        }

        String ans = "Yes";
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (canvas[i][j] == '#' && canvas[i - 1][j] == '*' && canvas[i + 1][j] == '*'
                        && canvas[i][j - 1] == '*' && canvas[i][j + 1] == '*') {
                    ans = "No";
                    break;
                }
            }
            if (ans.equals("No")) break;
        }
        System.out.println(ans);
    }
}
