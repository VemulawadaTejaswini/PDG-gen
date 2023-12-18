import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int c=0;
        for(int i=0;i<s.length()-4;i++)
        {
            for(int j=i+3;j<s.length();j++)
            {
                BigInteger b1 = new BigInteger(s.substring(i,j+1));
                BigInteger b2 = new BigInteger("2019");
                BigInteger result = b1.mod(b2);
                int intValueOfb1 = result.intValue();
                if(intValueOfb1==0)
                     c++;
            }
        }
        System.out.println(c);
    }
}