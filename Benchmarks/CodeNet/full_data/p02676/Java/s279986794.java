import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    String s=sc.next();
    if(s.length()<=k)
	System.out.println(s);
    else
    {
      String x="";
      for(int i=0;i<k;i++)
        x+=s.charAt(i);
      x+="...";
      System.out.println(x);
    }
 
    
    
  }
}