import java.io;
import java.util;
class Solution{
  public static void main(String args[]){
    Scanner sc=new Scanner();
    String s=sc.sscan();
    String t=sc.scan();
    t=t.substring(0,t.length-1);
    if(s.equals(t))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
