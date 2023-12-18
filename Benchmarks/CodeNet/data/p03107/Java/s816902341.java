import java.util.*;
public class SetCalc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        int len=s.length();
        while(s.indexOf("01")>=0) {
            s = s.replaceAll("01", "");
            count +=len-s.length();
            len=s.length();
        }
        while(s.indexOf("10")>=0) {
            s = s.replaceAll("10", "");
            count +=len-s.length();
            len=s.length();
        }
        System.out.println(count);
    }
}