import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str+"0";
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+3;j<str.length();j++)
            {
                String s ="";
                for(int k=i;k<j&&j<str.length();k++)
                {
                    s = s+str.charAt(k);
                }
                BigInteger b =new BigInteger(s);
               // System.out.println(b);
                BigInteger x = new BigInteger(String.valueOf(2019));
                BigInteger c = new BigInteger(String.valueOf(0));
                if(b.mod(x).equals(c))
                {
                    count = count+1;
                }
            }
        }
        System.out.print(count);

    }
}