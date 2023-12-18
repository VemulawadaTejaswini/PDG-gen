
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(final String[] args) {
 
        final Scanner sc = new Scanner(System.in);
 
        // 花の種類
        long flowerType = sc.nextLong();
        // 作成できない本数1,2
        long ng1 = sc.nextLong();
        long ng2 = sc.nextLong();
        // 作成可能な花束の種類
        BigInteger sum = BigInteger.valueOf(flowerType);
        // 作成できない花束の組み合わせ1,2
        BigInteger ngList1 = BigInteger.valueOf(0);
        BigInteger ngList2 = BigInteger.valueOf(0);
        Boolean isEvenNum = true;
        BigInteger halfNum = BigInteger.valueOf(0);

        // 花の種類偶奇判別
        if (flowerType % 2 != 0) {

            isEvenNum = false;
        }

        if (ng1 > flowerType / 2) {

            ng1 = flowerType - ng1;
        }

        if (ng2 > flowerType / 2) {

            ng2 = flowerType - ng2;
        }
 
        for (long i = 1; i <= (flowerType / 2); i++) {
 
            if (i == ng1 && i == ng2) {

                ngList1 = ngList1.add(calcCombination(flowerType, i));
                ngList2 = ngList2.add(calcCombination(flowerType, i));
                continue;
            }

            if (i == ng1) {
 
                ngList1 = ngList1.add(calcCombination(flowerType, i));
                continue;
            }
 
            if (i == ng2) {
 
                ngList2 = ngList2.add(calcCombination(flowerType, i));
                continue;
            }

            if (isEvenNum && i == (flowerType / 2)) {

                halfNum = halfNum.add(calcCombination(flowerType, i));
                break;
            }

            if (i > 1) {

                sum = sum.add(calcCombination(flowerType, i));
            }
        }
 
        sum = sum.multiply(BigInteger.valueOf(2));

        if (isEvenNum) {

            sum = sum.add(halfNum);
        }

        sum = sum.add(BigInteger.valueOf(1));
        sum = sum.subtract(ngList1);
        sum = sum.subtract(ngList2);

        // 出力
        System.out.println(sum.remainder(BigInteger.valueOf(1000000007)));
    }
 
    // 組み合わせ計算
    private static BigInteger calcCombination(Long n, Long m) {
 
        // 分子
        BigInteger molecule    = BigInteger.valueOf(1);
        // 分母
        BigInteger denominator = BigInteger.valueOf(1);
 
        if (m > n / 2) {
 
            m = n - m;
        }
 
        for (long i = 0; i < m; i++) {
 
            molecule    = molecule.multiply(BigInteger.valueOf(n - i));
            denominator = denominator.multiply(BigInteger.valueOf(m - i));
        }
 
        return molecule.divide(denominator);
    }
}