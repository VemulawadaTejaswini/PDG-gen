import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger CONST = new BigInteger("0");
        CONST = CONST.add(BigInteger.valueOf((long)Math.pow(10, 9) + 7));

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            xList.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            yList.add(sc.nextInt());
        }

        BigInteger ans = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {

                for (int k = 0; k < m; k++) {
                    for (int l = k+1; l < m; l++) {
                        long ver = getDistance(yList.get(k), yList.get(l));
                        long sid = getDistance(xList.get(j), xList.get(i));
                        ans = ans.add(BigInteger.valueOf(ver*sid));
                        ans = ans.remainder(CONST);
                    }
                }
            }
        }

        System.out.println(ans);
    }

    public static long getDistance(int p1, int p2) {
        double distance = Math.sqrt(Math.pow(p1-p2, 2));
        return (long)distance;
    }
}
