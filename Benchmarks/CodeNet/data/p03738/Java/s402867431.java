import java.util.Scanner;
import java.math.BigInteger;

class test {
    public static void main(String args[]) {
    int num = 0;
    BigInteger a, b;
    
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter two number: ");
    a = in.nextBigInteger();
    b = in.nextBigInteger();
    
    int res = a.compareTo(b);
    if(res < 0) 
        System.out.println("LESS");
    else if (res == 0)
        System.out.println("EQUAL");
    else
        System.out.println("GREATER");
    }
}