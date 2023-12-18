import java.util.Scanner;

/**
 * AtCoder Beginner Contest 158
 * D - String Formation
 * https://atcoder.jp/contests/abc158/tasks/abc158_d
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(sc.next());
        int q = sc.nextInt();

        boolean isAsc = true;
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                isAsc = !isAsc;
            } else {
                int f = sc.nextInt();
                if (f == 1) {
                    if (isAsc) {
                        sb.insert(0, sc.next());
                    } else {
                        sb.append(sc.next());
                    }
                } else {
                    if (isAsc) {
                        sb.insert(0, sc.next());
                    } else {
                        sb.append(sc.next());
                    }
                }
            }
        }
        if (isAsc) {
            System.out.print(sb.toString());
        } else {
            System.out.print(sb.reverse().toString());
        }

    }
}
