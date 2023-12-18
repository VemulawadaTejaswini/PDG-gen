import java.util.List;
import java.util.Scanner;

public class Main {
    static int count = 0;

    static boolean has753(int n) {
        boolean has7 = false;
        boolean has5 = false;
        boolean has3 = false;
        while (n > 0) {
            int v = n % 10;
            switch (v) {
            case 7:
                has7 = true;
                break;
            case 5:
                has5 = true;
                break;
            case 3:
                has3 = true;
                break;
            }
            n = n / 10;
        }
        return has7 && has5 && has3;

    }

    static void put3(int t, int n) {
        t = Integer.parseInt((Integer.toString(t) + "3"));
        if (t > n)
            return;
        else {
            if (has753(t)) {
                count++;
                putHelper(t, n);
            }
            putHelper(t, n);
            return;
        }

    }

    static void put5(int t, int n) {
        t = Integer.parseInt((Integer.toString(t) + "5"));
        if (t > n)
            return;
        else {
            if (has753(t)) {
                count++;
                putHelper(t, n);
            }
            putHelper(t, n);
            return;
        }

    }

    static void put7(int t, int n) {
        t = Integer.parseInt((Integer.toString(t) + "7"));
        if (t > n)
            return;
        else {
            if (has753(t)) {
                count++;
                putHelper(t, n);
            }
            putHelper(t, n);
            return;
        }

    }

    static void putHelper(int t, int n) {
        put3(t, n);
        put5(t, n);
        put7(t, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        putHelper(0, n);
        System.out.println(count);
    }
}
