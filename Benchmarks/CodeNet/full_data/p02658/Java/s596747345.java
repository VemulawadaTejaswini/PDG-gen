
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        BigInteger ans=new BigInteger("1");
        BigInteger check = new BigInteger("1000000000000000000");
        BigInteger temp ;
        n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            temp=scanner.nextBigInteger();
            ans = ans.multiply(temp);
        }
        if(ans.compareTo(check)>0)
            System.out.println(-1);
        else
            System.out.println(ans);


    }
}
