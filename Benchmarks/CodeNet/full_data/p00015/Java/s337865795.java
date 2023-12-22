import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;++i) {
            BigInteger a = scan.nextBigInteger();
            BigInteger b = scan.nextBigInteger();
            a=a.add(b);
            System.out.println(a);
        }
    }
}