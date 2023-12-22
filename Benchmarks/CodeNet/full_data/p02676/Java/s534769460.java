import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k=sc.nextInt();
    String s=sc.next();
    int n=s.length();
    if(n<=k)
      System.out.println(s);
    else
    {
      System.out.println(s.substring(0,k+1)+"..."));
    }
  }
}
