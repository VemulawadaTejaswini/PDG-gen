import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] intarray = new int[N];
        BigInteger[] bigIntArr = new BigInteger[N];
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            intarray[i] = a;
            bigIntArr[i] = BigInteger.valueOf(a);
        }
        /*BigInteger[] bigIntArr = {
            BigInteger.valueOf(2),
            BigInteger.valueOf(12),
            BigInteger.valueOf(36),
            BigInteger.valueOf(18)
        };*/
        //System.out.println("最大公約数： " + gcd(bigIntArr));
        // 最小公倍数
        //System.out.println("最小公倍数： " + lcm(bigIntArr));
        int bunbo = 0;
        int sum = 0;
        for(int i = 0; i < N; i++){
            BigInteger kari = lcm(bigIntArr);
            sum+= kari.intValue()/intarray[i];
        }
        //System.out.println(sum);
        BigDecimal lcm2 = new BigDecimal(lcm(bigIntArr).intValue());
        BigDecimal sum2 = new BigDecimal(sum);
        BigDecimal result1 = lcm2.divide(sum2,7, BigDecimal.ROUND_HALF_UP);
        System.out.println(result1);
      }
     
      // 最小公倍数（対象のすべての整数）
      public static BigInteger lcm(BigInteger... arr) {
        return Stream.of(arr).reduce((x, y) -> createLcm(x, y)).orElse(BigInteger.ONE);
      }
    
        //最小公倍数（指定した2つの整数）
        public static BigInteger createLcm(BigInteger x, BigInteger y) {
            return x.multiply(y)
                .divide(Objects.nonNull(creategcd(x, y)) ? creategcd(x, y) : BigInteger.ONE);
          }
         
          // 最大公約数（指定した2つの整数）
          public static BigInteger creategcd(BigInteger x, BigInteger y) {
            return (Objects.nonNull(x) ? x : BigInteger.ONE).gcd(y);
        }
      // 最大公約数（対象のすべての整数）
      public static BigInteger gcd(BigInteger[] arr) {
        return Stream.of(arr)
            .reduce(BigInteger::gcd)
            .orElse(BigInteger.ZERO);
        }
}