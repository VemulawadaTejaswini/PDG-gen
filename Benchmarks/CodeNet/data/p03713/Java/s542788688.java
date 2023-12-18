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
        int a = ww * h;
        int b = (h / 2) * (w - ww);
        System.out.println(Math.abs(a - b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
