import java.util.*;
class Naman
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String S=sc.next();
    int l=S.length();
    int Q=sc.nextInt();
    String str="";
    for(int i=0;i<Q;i++)
    {
      int T=sc.nextInt();
      if(T==1)
      {
        for(int j=l-1;j>=0;j--)
        {
          str=str+S.charAt(j);
        }
      }
      if(T==2)
      {
        int F=sc.nextInt();
        String C=sc.next();
        if(F=1)
        {
          str=C+S;
        }
        else
        {
          str=S+C;
        }
      }
    }
    System.out.println(str);
  }
}
      
      
      
      
      
      
      
      
      