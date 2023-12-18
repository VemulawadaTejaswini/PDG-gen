import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] p = new int[n];
        long wa = 0;
        long ac = 0;
        for (int i = 0; i < m; i++) {
            int pi = Integer.parseInt(sc.next());
            String s = sc.next();
            if ("WA".equals(s) && p[pi - 1] == 0) {
                wa++;
            } else if ("AC".equals(s) && p[pi - 1] == 0) {
                ac++;
                p[pi - 1] = -1;
            }
        }
        System.out.println(ac + " " + wa);
    }
}