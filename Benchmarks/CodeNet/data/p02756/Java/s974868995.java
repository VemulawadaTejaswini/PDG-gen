import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        int[] t = new int[q];
        int[] f = new int[q];
        String[] c = new String[q];
        for (int i = 0; i < q; i++) {
            t[i] = sc.nextInt();
            if (t[i] == 1) {
                continue;
            }
            f[i] = sc.nextInt();
            c[i] = sc.next();
        }

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < q; i++) {
            if (t[i] == 1) {
                sb.reverse();
                continue;
            }
            if (f[i] == 1) {
                sb.insert(0, c[i]);
                continue;
            }
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }

}
