import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static class Sord {
        int a, b;

        public Sord(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int h = sc.nextInt();
        Sord s[] = new Sord[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Sord(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(s, (o1, o2) -> o2.a - o1.a);
        int amax = s[0].a;

        Arrays.sort(s, (o1, o2) -> o2.b - o1.b);
        int cnt = 0;
        for (; cnt < n && s[cnt].b > amax; cnt++) {
            h -= s[cnt].b;
            if (h <= 0) {
                System.out.println(cnt + 1);
                return;
            }
        }

        System.out.println(cnt + (h + amax - 1) / amax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
