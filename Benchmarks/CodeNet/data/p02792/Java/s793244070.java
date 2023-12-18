import java.util.Scanner;

public class Main {

    private static int f(char i, char j, int n) {
        int r = 0;
        for (int k = 1; k <= n; k++) {
            String s = Integer.toString(k);
            if (s.charAt(0) == i && s.charAt(s.length() - 1) == j)
                r++;
        }
        return r;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Integer.parseInt(scanner.next());
            int r = 0;
            for (int i = 0; i < 10; i++) {
                char is = Integer.toString(i).charAt(0);
                for (int j = 0; j < 10; j++) {
                    char js = Integer.toString(j).charAt(0);
                    r += f(is, js, n) * f(js, is, n);
                }
            }
            System.out.println(r);
        }
    }

}
