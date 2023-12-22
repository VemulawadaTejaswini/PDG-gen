import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int K;
    Scanner in=new Scanner(System.in);
    K=in.nextInt();
    String S=in.next();
    int l=S.length();
    if(l<=K)
      System.out.println(S);
    else
    {
      String p=S.substring(0,K);
      p=p+"...";
      System.out.println(p);
    }
  }
        
}