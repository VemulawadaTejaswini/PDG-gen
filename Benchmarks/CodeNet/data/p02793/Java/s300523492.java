import java.util.*;
import static java.util.Comparator.*;
import java.math.BigInteger;

public class Main {
    private static BigInteger MOD = BigInteger.valueOf(1000000007L);
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<BigInteger> numList = new LinkedList<>();
        for(int i=0;i<N;i++){
            numList.add(BigInteger.valueOf(Long.parseLong(sc.next())));
        }
        BigInteger lcmNum = numList
                    .stream()
                    .sorted(reverseOrder())
                    .reduce(numList.get(0),(s1,s2) -> s1.multiply(s2.divide(s1.gcd(s2))));
        BigInteger res =numList
                .stream()
                .parallel()
                .map(s -> lcmNum.divide(s))
                .reduce(BigInteger.ZERO,(s1,s2) -> s1.add(s2));
        System.out.println(res.mod(MOD));
    }
}
