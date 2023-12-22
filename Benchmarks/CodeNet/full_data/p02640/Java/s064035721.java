
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tousuu = 0;
        int honsuu = 0;

        tousuu = scanner.nextInt();
        honsuu = scanner.nextInt();

        int turuasi = 2;
        int kameasi = 4;

        int kame = (honsuu - turuasi * tousuu) / (kameasi - turuasi);
//        System.out.println(kame);
        int turu = tousuu - kame;
//        System.out.println(turu);
//                System.out.println((turuasi +" " +turu + " " +kameasi +" " + kame));
//                System.out.println((turuasi * turu + kameasi * kame));
        if (turu >= 0 && kame >= 0) {
            if ((turuasi * turu + kameasi * kame) == honsuu) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
