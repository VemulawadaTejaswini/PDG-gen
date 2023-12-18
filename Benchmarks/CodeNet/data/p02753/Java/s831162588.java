import java.util.*;
 class A
{
public static void main(String []args)
{
   Scanner s=new Scanner(System.in);
   String st=s.next();
   char ch[]=st.toCharArray();
   char c=ch[0];
   boolean b=true;
   for(int i=1;i<st.length();i++)
   {
     if(ch[i]!=c)
     {
       b=false;
       break;
     }
   }
  if(b)
    System.out.println("NO");
  else
    System.out.println("YES");
}
}
    