
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
        BigInteger sum = BigInteger.valueOf(0);

        for (long i = 1; i <= flowerType; i++) {

            if (i == ng1 || i == ng2) {

                continue;
            }

            sum = sum.add(calcCombination(flowerType, i));
        }

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