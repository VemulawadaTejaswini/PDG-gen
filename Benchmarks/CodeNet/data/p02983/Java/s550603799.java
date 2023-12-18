
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long L = scanner.nextLong();
        long R = scanner.nextLong();


        long modL = mod2019(mod2019(L));
        long modR = mod2019(mod2019(R));

        long nextMod0Number = (L + 2019 - modL);

        if (modL == 0 || modR == 0) {
            System.out.println("0");
            return;
        }

        if (nextMod0Number <= R) {
            System.out.println("0");
            return;
        }

        long mod673L = mod673(L);
        long nextMod0Number673 = (L + 673 - mod673L);

        if (nextMod0Number673 <= R) {
            if (nextMod0Number673 - 1 >= L || nextMod0Number673 + 2 <= R) {
                System.out.println("0");
            } else {
                System.out.println(mod2019(nextMod0Number673 * (nextMod0Number673 + 1)));
            }
        } else {
            System.out.println(mod2019(L * (L + 1)));
        }
    }

    private static long mod2019(long hoge) {
        return hoge % 2019;
    }
    private static long mod673(long hoge) {
        return hoge % 673;
    }
}