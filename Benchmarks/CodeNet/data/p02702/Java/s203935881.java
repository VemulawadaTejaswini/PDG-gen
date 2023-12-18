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
        BigInteger x = new BigInteger(String.valueOf(2019));
        BigInteger c = new BigInteger(String.valueOf(0));
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+4;j<str.length();j++)
            {
                String s =str.substring(i,j);

                BigInteger b =new BigInteger(s);
                System.out.println(b);

                if(b.mod(x).equals(c))
                {
                    count = count+1;
                }
            }
        }
        System.out.print(count);

    }
}