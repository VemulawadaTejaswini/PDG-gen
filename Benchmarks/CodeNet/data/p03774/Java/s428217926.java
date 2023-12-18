import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long[][] ab = new long[n][2];
        long[][] cd = new long[m][2];
        for (int i = 0; i < n; i++) {
            ab[i][0] = Long.parseLong(sc.next());
            ab[i][1] = Long.parseLong(sc.next());
        }
        for (int i = 0; i < m; i++) {
            cd[i][0] = Long.parseLong(sc.next());
            cd[i][1] = Long.parseLong(sc.next());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long idx = Long.MAX_VALUE;
            long sub = Long.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                long temp = Math.abs(cd[j][0] - ab[i][0]) + Math.abs(cd[j][1] - ab[i][1]);
                if (temp < sub) {
                    sub = temp;
                    idx = j;
                }
            }
            sb.append(idx + 1);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}