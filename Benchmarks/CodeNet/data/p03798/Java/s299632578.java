import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        boolean[][] b = new boolean[4][n + 1];
        b[0][0] = true;
        b[2][0] = true;
        b[2][1] = true;
        b[3][1] = true;

        for (int i = 1; i < n; i++) {
            for (boolean[] bb : b) {
                if (s.charAt(i) == 'o') {
                    bb[i + 1] = bb[i] ? bb[i - 1] : !bb[i - 1];
                } else {
                    bb[i + 1] = bb[i] ? !bb[i - 1] : bb[i - 1];
                }
            }
        }

        for (boolean[] bb : b) {
            if (bb[0] == bb[n]) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if (bb[i]) {
                        sb.append("S");
                    } else {
                        sb.append("W");
                    }
                }
                System.out.println(sb.toString());
                return;
            }
        }
        System.out.println("-1");
    }
}
