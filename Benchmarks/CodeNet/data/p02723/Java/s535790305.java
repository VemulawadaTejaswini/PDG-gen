import java.util.*;
class coffee
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    
    if(s.charAt(2).equals(s.charAt(3))&&s.charAt(4).equals(s.charAt(5)))
      System.out.println("Yes");
    else System.out.println("No");
  }
}
