import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        String givenNum = sc.next();
        int dividedCount = 0;
        BigInteger _2019 = BigInteger.valueOf(2019);
        for (int i = 0; i < givenNum.length(); i++) {
            for (int j = i + 1; j <= givenNum.length(); j++) {
                String cutNum = givenNum.substring(i, j);
                BigInteger parsedNum = new BigInteger(cutNum);
                BigInteger remainder = parsedNum.remainder(_2019);
                dividedCount += remainder.equals(BigInteger.ZERO) ? 1 : 0;
            }
        }
        System.out.println(dividedCount);
    }
}
