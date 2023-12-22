import java.util.*;
public class Main
{
    public static void main(String[] df)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        int count=0;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i))
                count++;
        System.out.println(count);
    }
}