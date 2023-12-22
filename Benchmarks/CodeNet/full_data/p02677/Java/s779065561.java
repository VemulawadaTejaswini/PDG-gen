import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        // 12時を0度としたときの、時針の角度
        double as = 0.0;
        if (h != 0) {
            as = 1.0 * h / 12 * 360;
        }
        // 円の中心を(0.0)としたときの時針のX座標
        BigDecimal atenx = new BigDecimal(0.0);
        BigDecimal ax = new BigDecimal(0.0);
        if (as < 180) {
            atenx = new BigDecimal(a * Math.sin(Math.toRadians(as)));
            ax = atenx.setScale(11, BigDecimal.ROUND_HALF_UP);
        } else {
            atenx = new BigDecimal(a * Math.sin(Math.toRadians(as))).negate();
            ax = atenx.setScale(11, BigDecimal.ROUND_HALF_UP).negate();
        }
        // 円の中心を(0.0)としたときの時針のX座標
        BigDecimal ateny = new BigDecimal(0.0);
        BigDecimal ay = new BigDecimal(0.0);
        if (as < 90 || 270 < as) {
            ateny = new BigDecimal(a * Math.cos(Math.toRadians(as)));
            ay = ateny.setScale(11, BigDecimal.ROUND_HALF_UP);
        } else {
            ateny = new BigDecimal(a * Math.cos(Math.toRadians(as))).negate();
            ay = ateny.setScale(11, BigDecimal.ROUND_HALF_UP).negate();
        }

        double bs = 0.0;
        if (m != 0) {
            bs = 1.0 * m / 60 * 360;
        }
        BigDecimal btenx = new BigDecimal(0.0);
        BigDecimal bx = new BigDecimal(0.0);
        if (bs < 180) {
            btenx = new BigDecimal(b * Math.sin(Math.toRadians(bs)));
            bx = btenx.setScale(11, BigDecimal.ROUND_HALF_UP);
        } else {
            btenx = new BigDecimal(b * Math.sin(Math.toRadians(bs))).negate();
            bx = btenx.setScale(11, BigDecimal.ROUND_HALF_UP).negate();
        }
        BigDecimal bteny = new BigDecimal(0.0);
        BigDecimal by = new BigDecimal(0.0);
        if (bs < 90 || 270 < bs) {
            bteny = new BigDecimal(b * Math.cos(Math.toRadians(bs)));
            by = bteny.setScale(11, BigDecimal.ROUND_HALF_UP);
        } else {
            bteny = new BigDecimal(b * Math.cos(Math.toRadians(bs))).negate();
            by = bteny.setScale(11, BigDecimal.ROUND_HALF_UP).negate();
        }

        System.out.println(String.valueOf(Math.sqrt((ax.subtract(bx)).multiply(ax.subtract(bx)).add((ay.subtract(by)).multiply(ay.subtract(by))).doubleValue())));
    }
}