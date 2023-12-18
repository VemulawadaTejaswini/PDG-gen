import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    String sub=s.substring(1,s.length()-1);
    String result=s.charAt(0) +"";
    result+=sub.length() + ""+s.charAt(s.length()-1);
    System.out.println(result);
  }
}