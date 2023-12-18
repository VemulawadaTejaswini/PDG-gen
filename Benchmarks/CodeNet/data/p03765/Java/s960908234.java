import java.util.*;

public class Main {
    public void main(Scanner sc) {
        char s[] = sc.next().toCharArray();
        char t[] = sc.next().toCharArray();
        int sums[] = new int[s.length + 1];
        int sumt[] = new int[t.length + 1];

        for (int i = 0; i < s.length; i++) {
            sums[i + 1] = sums[i] + (s[i] == 'A' ? 1 : 2);
        }
        for (int i = 0; i < t.length; i++) {
            sumt[i + 1] = sumt[i] + (t[i] == 'A' ? 1 : 2);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            System.out.println((sums[b] - sums[a - 1]) % 3 == (sumt[d] - sumt[c - 1]) % 3 ? "YES"
                : "NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
