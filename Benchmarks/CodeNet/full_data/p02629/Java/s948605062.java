import java.util.*;
import java.math.BigInteger;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BigInteger a = new BigInteger(scan.next());
    scan.close();

    int[] alpha = new int[26];
    int cnt = 0;
    int tmp;
    BigInteger bi26 = new BigInteger("26");
    BigInteger bi1 = new BigInteger("1");
    BigInteger bi0 = new BigInteger("0");
    while(a.compareTo(bi0) == 1) {
        BigInteger rem = a.remainder(bi26);
        String strrem = rem.toString();
        tmp = Integer.parseInt(strrem);
        if (tmp == 0) {
            alpha[cnt] = 26;
            a = a.divide(bi26);
            a = a.subtract(bi1);
        } else {
            alpha[cnt] = tmp;
            a = a.divide(bi26);
        }
        cnt++;
    }
//for(int i=0;i<cnt;i++) {
//    System.out.println(alpha[i]);
//}

    StringBuilder sb = new StringBuilder();
    for(int i=0;i<cnt;i++) {
        byte[] ascii = new byte[cnt];
        ascii[i] = (byte)(97 + alpha[i] - 1);
        String outstr = new String(ascii);
        sb.insert(0,outstr);
    }

    System.out.println(sb);

}
}
