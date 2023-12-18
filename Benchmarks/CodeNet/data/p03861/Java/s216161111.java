import java.math.BigInteger; 
import java.util.Scanner;

class Main {

    
    public static void main(String[] args) {
        int one = 1;
        BigInteger a, b, r;
        int d;
        Scanner input;
        input = new Scanner(System.in);
        a = input.nextBigInteger();
        b = input.nextBigInteger();
        d = input.nextInt();
        r = ((b.subtract(a)).add(BigInteger.valueOf(one))).divide(BigInteger.valueOf(d));
        
        System.out.println(r);
    }
    
}