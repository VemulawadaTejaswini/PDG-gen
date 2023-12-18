
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        for(int i = -1000;i <= 1000;i++){
            for(int j = -1000;j <= 1000;j++){
                BigInteger t = BigInteger.valueOf(i);
                BigInteger m = BigInteger.valueOf(j);
                BigInteger cur = t.pow(5).subtract(m.pow(5));
                if(cur.equals(BigInteger.valueOf((int)x))){
                    System.out.println(i + " " + j);return ;
                }
            }
        }
//        for(int i = 100;i <= 10000;i++){
//            BigInteger x = BigInteger.valueOf(i);
//            BigInteger t = BigInteger.valueOf(i - 1);
//            BigInteger cur = x.pow(5);
//            BigInteger cnt = t.pow(5);
//            BigInteger ans = cur.subtract(cnt);
//            ans = ans.subtract(BigInteger.valueOf((int)1e9));
//            System.out.println(i + " " + ans);
//        }
    }
}
