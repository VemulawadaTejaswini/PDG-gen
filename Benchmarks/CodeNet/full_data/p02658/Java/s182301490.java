import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger ans = BigInteger.ONE;
        BigInteger limit = new BigInteger("1000000000000000000");
        for(int i=0;i<n;i++){
            long val = sc.nextLong();
            ans = ans.multiply(new BigInteger(Long.toString(val)));
        }
        if(ans.compareTo(limit)==1) System.out.println(-1);
        else System.out.println(ans);
    }
}
