import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] p = new Integer[m];
        Integer[] y = new Integer[m];
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 0; j < m; j++) {
                if (p[j] == i) {
                    sb.append(String.format("%06d", i));
                    sb.append(String.format("%06d", num));
                    sb.append("\n");
                    num++;
                }
            }
        }

        System.out.print(sb.toString());
    }
}