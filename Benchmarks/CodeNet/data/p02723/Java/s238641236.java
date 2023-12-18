import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    
    String S;
    S=in.nextLine();
    if(S.charAT(2)==S.charAT(3) && S.charAT(4)==S.charAT(5))
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}