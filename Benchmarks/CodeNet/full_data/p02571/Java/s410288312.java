import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        String s1 = kb.nextLine();
        String s2 = kb.nextLine();

        int k = s2.length();
        int min = Integer.MAX_VALUE;

        for(int i = k ; i <= s1.length() ; i++)
        {
            String tmp = s1.substring(i-k,i);
            int t = diff(s2,tmp);
            if(t < min)
                min = t;
        }
        System.out.println(min);

    }
    public static int diff(String s1,String s2)
    {
        int res = 0;

        for(int i = 0 ; i < s1.length() ; i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                res++;
            }
        }
        return res;
    }
}