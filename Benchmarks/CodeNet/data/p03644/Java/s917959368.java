import java.util.Scanner;


/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {

    static int IleRazy(int i) {
        int licznik = 0;
        while (i % 2 == 0) {
            i /= 2;
            ++licznik;
        }
        return licznik;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int wynik = 0, res = 0;
        for (int i = 1; i <= n; i++) {
            int ilosc = IleRazy(i);
            if (ilosc >= wynik) {
                wynik = ilosc;
                res = i;
            }
        }
        System.out.println(res);
    }
}
