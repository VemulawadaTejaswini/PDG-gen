import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    String num = sc.next();
    int n = num.length();
    
    if(num.substring(n-1,n).equals("0") || num.substring(n-1,n).equals("1") || num.substring(n-1,n).equals("6") || num.substring(n-1,n).equals("8") ) {
      System.out.println("pon");
      return ;
    } else if(num.substring(n-1,n).equals("3")) {
      System.out.println("bon");
      return ;
    } else {
      System.out.println("hon");
    }
  }
}