import java.util.*;

public class Main {
    public void main(Scanner sc) {
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();
        int sums[] = new int[s.length + 1];
        int sumt[] = new int[t.length + 1];

        for (int i = 0; i < s.length; i++) {
            sums[i + 1] = (sums[i] + (s[i] == 'A' ? 1 : 2)) % 3;
        }
        for (int i = 0; i < t.length; i++) {
            sumt[i + 1] = (sumt[i] + (t[i] == 'A' ? 1 : 2)) % 3;
        }

        int q = sc.nextInt();
        int a, b, c, d;
        for (int i = 0; i < q; i++) {
            a = sums[sc.nextInt() - 1];
            b = sums[sc.nextInt()];
            c = sumt[sc.nextInt() - 1];
            d = sumt[sc.nextInt()];

            System.out.println(((3 + b - a) % 3 == (3 + d - c) % 3) ? "YES" : "NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
