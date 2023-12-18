import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean[] res9 = new boolean[9];
        int dig = -1;
        for (int i = 0, x = 9; i < 9; i++, x = x * 10 + 9) {
            System.out.println(String.format("? %d", x));
            System.out.flush();
            res9[i] = sc.next().charAt(0) == 'Y';
            if (!res9[i]) {
                dig = i;
                break;
            }
        }
        if (dig == -1) {
            for (int i = 0, x = 8; i < 9; i++, x = (x + 1) * 10 + 8) {
                System.out.println(String.format("? %d", x));
                System.out.flush();
                res9[i] = sc.next().charAt(0) == 'Y';
                if (!res9[i]) {
                    dig = i;
                    System.out.println(String.format("! %d", x + 1));
                    System.out.flush();
                    sc.close();
                    return;
                }
            }
            System.out.println(String.format("! %d", 1000000000));
            System.out.flush();
            sc.close();
            return;
        }
        int l = 1;
        for (int i = 0; i < dig; i++) {
            l *= 10;
        }
        int r = l * 10;
        while (r - l > 1) {
            int m = (l + r) >> 1;
            System.out.println(String.format("? %d", m));
            System.out.flush();
            if (sc.next().charAt(0) == 'Y') {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(String.format("! %d", l));
        System.out.flush();
        sc.close();
    }
}
