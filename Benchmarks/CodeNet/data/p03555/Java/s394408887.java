import java.util.*;
class Main
{
    public static void main()
    {
       String s1,s2;
       int c=0;
      Scanner in=new Scanner(System.in);
      s1=in.nextLine();
      s2=in.nextLine();
    
      StringBuffer sb=new StringBuffer(s2);
      if(!(sb.reverse().toString().equals(s1)))
      {
          c=1;
      }  
    if(c==0)
        System.out.println("YES");
    else
            System.out.println("NO");
}
}