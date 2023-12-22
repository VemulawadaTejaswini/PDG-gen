import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String S = new Scanner(System.in).next();
        int length=S.length(),count=0;
        BigInteger rem=BigInteger.valueOf(2019);
        for (int keta=4;length>=keta;keta++){
            for (int start=0;length>=keta+start;start++) {
                BigInteger tmp = BigInteger.valueOf(Long.parseLong(S.substring(start,start+keta)));
                if (tmp.remainder(rem).equals(BigInteger.ZERO))count++;
            }
        }
        System.out.println(count);
    }
}