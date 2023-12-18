import java.util.*;
class Station
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.hasNext();
    int l=str.length();
    String result="";
    for(int i=0;i<l;i++)
    {
      Char ch=str.charAt(i);
      result=result+ch;
    }
    if(result.equals("AAA")||result.equals("BBB"))
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}
      
      
      
    
    