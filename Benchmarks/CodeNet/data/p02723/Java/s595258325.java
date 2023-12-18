import java.util.*;
class q1
{
    public static void main(String args[])
    {
       int l;
       String s;
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       if(s.length()==6)
       {
       if((s.charAt(2)== s.charAt(3)) && (s.charAt(4) == s.charAt(5) ) )
               System.out.print("Yes");
       else
               System.out.print("No");
       }
    }
}