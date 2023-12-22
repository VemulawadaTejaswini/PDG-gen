import java.util.Scanner ;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    
    String a , b=" " ;
    
    a=in.nextLine();
    
    int l=a.length();
    
    int i ;
    
    for(i=l-1;i>=0;i--)
    {
      b=b + a.charAt(i);
    }
    
    System.out.println(b);
    
    
  }
}