import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long k = input.nextLong();

        if (k == 0){
            System.out.println(-1);
            return;
        }else if(b != 0 && a !=0  && c!= 0){
            System.out.println(a-b);
        }else if (b == 0 && c == 0 ){
            BigInteger val = BigInteger.valueOf(a).multiply(BigInteger.valueOf(k));
            if (val.compareTo(BigInteger.valueOf(1000000000000000000L)) > 0){
                System.out.println("Unfair");

            }else{
                System.out.println(val);
            }
        }else if ( a == 0 && c == 0){
            BigInteger val = BigInteger.valueOf(b).multiply(BigInteger.valueOf(k));
            if (val.compareTo(BigInteger.valueOf(1000000000000000000L)) > 0){
                System.out.println("Unfair");

            }else{
                System.out.println(val);
            }
        }else{

            System.out.println(a-b);
        }


    }
}
