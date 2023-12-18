import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        final BigInteger devider = BigInteger.valueOf((long) (Math.pow(10,9) + 7));

        Scanner sc = new Scanner(System.in);
        int numberCount = sc.nextInt();
        List<BigInteger>numList = new ArrayList<>();
        for(int i = 1;i <= numberCount ; i++){
            BigInteger number = BigInteger.valueOf(sc.nextLong());
            numList.add(number);

        }
        BigInteger result = BigInteger.ZERO;
        for(int i = 1;i <= numberCount ; i++){
            BigInteger  a = numList.get(i - 1);
            List<BigInteger > bList = numList.subList(i,numList.size());
            for(BigInteger  b : bList){
                result = result.add(xor(a,b));
            }
        }
        System.out.println(result.remainder(devider));



    }

    public static BigInteger xor(BigInteger  a , BigInteger  b){
        return a.xor(b);
    }
}