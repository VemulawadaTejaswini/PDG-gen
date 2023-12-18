import java.util.*;

public class Main {

    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();

        if (h % 3 == 0 || w % 3 == 0) {
            System.out.println(0);
            return;
        }

        if (h > w) {
            int tmp = h;
            h = w;
            w = tmp;
        }

        int ww = (w + 1) / 3;
        int hh = h / 2;
        int a = ww * h;
        int b = hh * (w - ww);
        int c = (h - hh) * (w - ww);
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println(max - min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
