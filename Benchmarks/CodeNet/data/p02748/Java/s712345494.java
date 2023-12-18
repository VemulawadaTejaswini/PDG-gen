import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String ans = "";

        int[] abm = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] an = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int mostCheapCoupon = 999999;
        for (int i = 0; i < abm[2]; i++) {
            int[] xyc = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int usedCoupon = an[xyc[0] - 1] + bn[xyc[1] - 1] - xyc[2];
            if (usedCoupon < mostCheapCoupon) {
                mostCheapCoupon = usedCoupon;
            }
        }
        Arrays.sort(an);
        Arrays.sort(bn);
        int mostCheap = an[0] + bn[0];
        if (mostCheapCoupon < mostCheap) mostCheap = mostCheapCoupon;

        System.out.println(mostCheap);
    }
}
