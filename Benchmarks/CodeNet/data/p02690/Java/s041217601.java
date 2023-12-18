

import java.math.BigInteger;
        import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger x = cin.nextBigInteger();
        for(int i = -200;i <= 200;i++){
            for(int j = -200;j <= 200;j++){
                BigInteger a = BigInteger.valueOf(i);
                BigInteger b = BigInteger.valueOf(j);
                BigInteger cur = a.pow(5);
                BigInteger cnt = b.pow(5);
                BigInteger ans = cur.subtract(cnt);
                if(ans.equals(x)){
                    System.out.println(i + " " + j);return ;
                }
            }
        }
    }
}
