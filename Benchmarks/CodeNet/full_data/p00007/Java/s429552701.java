import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

    private static final double TAX = 1.05;

    /**
     * <p> [??????] n ?????\???????????¨??????n ??±????????????????????????????????????????????????????????°?????????n ??? 100 ??\??????</p>
     * <p> [??¬???] ???????????????</p>
     * <p> [??????] ???????????????</p>
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        String week = new BufferedReader(new InputStreamReader(System.in)).readLine();

        double totalAmount = 100000;
        BigDecimal returnAmount = new BigDecimal(totalAmount);
        int i = Integer.parseInt(week);

        // ??\??????????????°???????????????????¢?????????????
        for (int count = 0; count < i; count++) {
            totalAmount = totalAmount * TAX;
            returnAmount = new BigDecimal(totalAmount).setScale(-4, BigDecimal.ROUND_UP);
        }
        // ???????????????????????????
        System.out.println(returnAmount.intValue());
    }

}