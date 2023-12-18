import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner in = new Scanner (System.in);
        BigInteger n = new BigInteger(in.nextLine ());
        BigInteger a = new BigInteger(in.nextLine ());
        BigInteger b = new BigInteger(in.nextLine ());
        BigInteger x = (b.subtract (a)).divide (BigInteger.valueOf (2));

//        BigDecimal big = new BigDecimal(y);
//        big = big.setScale(0, RoundingMode.HALF_UP);
//        String rounded = big.toString();
//        BigDecimal x = new BigDecimal(rounded);
//
//        System.out.println ("x"+x);

        if((b.subtract (a)).mod (BigInteger.valueOf (2))==(BigInteger.valueOf (0))){
            System.out.println (x);
        }

        else if((b.subtract (a)).mod (BigInteger.valueOf (2))!=(BigInteger.valueOf (0))){
            if((a.subtract (BigInteger.valueOf (1))).compareTo (n.subtract (b))<0)
                System.out.println (x.add (b.subtract (x).subtract (BigInteger.valueOf (0))));
            else
                System.out.println (x.add (n.subtract (a.add (x))));
        }
    }
}
