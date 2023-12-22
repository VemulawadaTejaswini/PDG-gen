import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                count++;
                if((i+1)<s.length())
                    if(s.charAt(i+1)=='R')
                        count++;
            }
        }
        System.out.println(count);
    }
}