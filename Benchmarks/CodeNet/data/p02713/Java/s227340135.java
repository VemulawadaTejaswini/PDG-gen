import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<Integer> listA = Stream.iterate(1 , i -> i+1)
                .limit(k)
                .collect(Collectors.toList());
        List<Integer> listB = Stream.iterate(1 , i -> i+1)
                .limit(k)
                .collect(Collectors.toList());
        List<Integer> listC = Stream.iterate(1 , i -> i+1)
                .limit(k)
                .collect(Collectors.toList());
        long sum = 0;
        for(Integer n1 : listA){
            for(Integer n2 : listB){
                for(Integer n3 : listC){
                    int[] array = {n1.intValue(), n2.intValue(), n3.intValue()};
                    sum +=gcd(array);
                }
            }
        }
        System.out.println(sum);


    }

    private static int gcd(int[] args){
        return IntStream.of(args)
                .mapToObj(BigInteger::valueOf) // 型変換
                .reduce(BigInteger::gcd) // Python版のreduce(math.gcd)とほぼ同じですね
                .orElse(BigInteger.ZERO) // ↑はOptional<BigInteger>を返すので
                .intValue();
    }
}
